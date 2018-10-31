package ru.smartsarov.rosreestr;

import static ru.smartsarov.rosreestr.Constants.PKK5_API_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_API_ADDRESS_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_API_NUMBER_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_API_OBJECT_ID_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_AREA_TYPES;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_OBJECT_TYPES;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_UNITS;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ru.smartsarov.rosreestr.json.FirObjects;
import ru.smartsarov.rosreestr.json.object.RosreestrObject;
import ru.smartsarov.rosreestr.json.type.Attrs;
import ru.smartsarov.rosreestr.json.type.RosreestrType;

// TODO заменить searchRosreestrById, searchRosreestrByNumber, searchPkk5ById на одну функцию. Добавить <T>
// TODO обработать исключение 503 от jsoup, перенаправить запросы с ПКК5 на РР

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class Rosreestr {
	private Gson gson = new GsonBuilder().create();

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML + ";charset=UTF-8")
    public Response index() {
		try(InputStream is = this.getClass().getResourceAsStream("/static/index.html")) {
			return Response.status(Response.Status.OK).entity(is).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.toString()).build();
		}
    }
	
	@GET
	@Path("/search/{text}")
    public Response searchByText(@PathParam("text") String text) {
		String result;
		RosreestrObject ro;

		try {
			/*52:18:70009:39
			АА:ВВ:CCCCСCC:КК
			АА — кадастровый округ (области, края)
			ВВ — кадастровый район (районы области)
			CCCCCCС — кадастровый квартал состоит из 6 или 7 цифр.
			КК — номер земельного участка.
			У id в CCCCСCC отсутствуют 2 ведущих нуля*/
			/*if (text.matches("\\d{2}:\\d{2}:\\d{4,7}:\\d{2,3}")) {
				RosreestrType t = searchPkk5ByText(text);
				if (t.getTotal() == null) {
					// Ищем objectId по номеру
					List<FirObjects> fo = gson.fromJson(searchRosreestrByNumber(text), new TypeToken<List<FirObjects>>(){}.getType());
					if (!fo.isEmpty()) {
						String res = searchRosreestrById(fo.get(0).getObjectId());
						
						return Response.status(Response.Status.OK).entity(res).build();
					}
				}
				return Response.status(Response.Status.OK).entity(r).build();
			}*/

			// 1. Ищем на PKK5 по маске кадастрового номера, или адресу, или координатам [x y]
			RosreestrType textSearch = searchPkk5ByText(text);
			if (textSearch == null || textSearch.getFeatures() == null || textSearch.getFeatures().isEmpty()) {
				// Ищем на Росреестре по objectId
				String searchByNumber = searchRosreestrByNumber(text);
				List<FirObjects> fo = gson.fromJson(searchByNumber, new TypeToken<List<FirObjects>>(){}.getType());
				// TODO добавить поиск по номеру РР searchRosreestrByAddress
				return Response.status(Response.Status.OK).entity(fo == null || fo.isEmpty() ? "" : searchRosreestrById(fo.get(0).getObjectId())).build();
			}

			// 2. Ищем на PKK5 по id из найденного в 1.
			if (textSearch != null && textSearch.getStatus().equals(Response.Status.OK.getStatusCode())) {
				if (textSearch.getFeatures().size() == 1) {
					// TODO
					ro = searchPkk5ById(textSearch.getFeatures().get(0).getAttrs().getId());
					 
				} else { // Найдено больше одного объекта
					// возвращаем массив найденных адресов и id, чтобы затем выбрать нужный id и найти по нему.
					List<Attrs> attrs = new ArrayList<>();
					textSearch.getFeatures().stream().forEach(f -> attrs.add(f.getAttrs()));
					return Response.status(Response.Status.OK).entity(gson.toJson(attrs, new TypeToken<List<Attrs>>(){}.getType())).build();
				}
			} else {
				// Если поле status != 200, значит в процессе выполнения возникли ошибки. Текст ошибки выводится в поле note.
				return Response.status(Response.Status.OK).entity(textSearch).build();
			}
		} catch (IOException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.toString()).build();
		}

		// сделать метод, обнуляющий ненужные поля у ro
		
		ru.smartsarov.rosreestr.json.object.Attrs attrs = ro.getFeature().getAttrs();
		attrs.setAreaType(ROSREESTR_AREA_TYPES.get(attrs.getAreaType()));
		attrs.setAreaUnit(ROSREESTR_UNITS.get(attrs.getAreaUnit()));
		attrs.setCadUnit(ROSREESTR_UNITS.get(attrs.getCadUnit()));
		
		result = gson.toJson(attrs, ru.smartsarov.rosreestr.json.object.Attrs.class);
		
		return Response.status(Response.Status.OK).entity(result).build();
    }

	private String searchRosreestrByNumber(String number) throws IOException {
		Document doc = Jsoup.connect(ROSREESTR_API_NUMBER_URL.concat(number))
				.ignoreContentType(true)
    			.get();

		org.jsoup.Connection.Response response = Jsoup.connect(ROSREESTR_API_NUMBER_URL.concat(number)).ignoreContentType(true).execute();
		if (Arrays.asList(Response.Status.NO_CONTENT.getStatusCode(), Response.Status.NOT_FOUND.getStatusCode()).contains(response.statusCode())) {
			
		}
		String r = response.body();
		
		String result = Jsoup.connect(ROSREESTR_API_NUMBER_URL.concat(number))
				.ignoreContentType(true)
    			.get().body().text();

		/*RosreestrObject ro = gson.fromJson(result, RosreestrObject.class);
		
		// Если поле status != 200, значит в процессе выполнения возникли ошибки. Текст ошибки выводится в поле note.
		if (ro != null && ro.getStatus() != Response.Status.OK.getStatusCode()) {
			
		}*/
		
		return result;
	}
	
	private String searchRosreestrById(String id) throws IOException {
		String result = Jsoup.connect(ROSREESTR_API_OBJECT_ID_URL.concat(id))
				.ignoreContentType(true)
    			.get().body().text();

		//FirObject fo = gson.fromJson(result, FirObject.class);
		
		return result;
	}
	
	private String searchRosreestrByAddress(String address) throws IOException {

		// вызываем геокодер Яндекса, от него получить macroRegionId и RegionId
		/*AdministrativeArea": {
        "AdministrativeAreaName": "Нижегородская область",
        "SubAdministrativeArea": {
          "SubAdministrativeAreaName": "Кстовский район",
          "Locality": {
            "LocalityName": "село Чернуха",*/
		
		// вызываем ROSREESTR_API_ADDRESS_URL		
		String result = Jsoup.connect(ROSREESTR_API_ADDRESS_URL)
				.ignoreContentType(true)
  				.data("macroRegionId", "122000000000")	// Ниж. обл.
  				.data("RegionId", "122503000000")	// Саров
  				.data("street", "Яблоневая")
  				.data("house", "1")
    			.post().body().text();
		
		return result;
	}

	/**
	 * <b>Поиск по маске кадастрового номера, адресу, координатам</b>
	 * 
	 * @param text может принимать значения маски кадастрового номера, адреса, координат [x y]<br>Примеры: text=61:26:0600024:*, text=арзамас ленина 20, text=56.309636 44.024316
	 * @return {@link RosreestrType}
	 * @throws IOException
	 */
	private RosreestrType searchPkk5ByText(String text) throws IOException {
		String result = null;
		
		try {
			result = Jsoup.connect(PKK5_API_URL.concat(String.valueOf(ROSREESTR_OBJECT_TYPES.get("Земельные участки"))))
				.timeout(30000)
				.ignoreContentType(true)
				.data("text", text)
				.data("limit", "30")
    			.post().body().text();
		} catch(SocketTimeoutException e) {
			//e.printStackTrace();
			//throw new SocketTimeoutException("Ответ от ".concat(PKK5_API_URL).concat(" не был получен за 60 секунд"));
			
			//searchRosreestrByAddress(text);
		}

		RosreestrType ro = gson.fromJson(result, RosreestrType.class);
		
		// Если поле status != 200, значит в процессе выполнения возникли ошибки. Текст ошибки выводится в поле note.
		if (ro != null && ro.getStatus() != Response.Status.OK.getStatusCode()) {
			
		}
		
		return ro;
	}
	
	private RosreestrObject searchPkk5ById(String id) throws IOException {
		String r = PKK5_API_URL.concat(String.valueOf(ROSREESTR_OBJECT_TYPES.get("Земельные участки"))).concat("/").concat(id);
		String result = Jsoup.connect(PKK5_API_URL.concat(String.valueOf(ROSREESTR_OBJECT_TYPES.get("Земельные участки"))).concat("/").concat(id))
				.ignoreContentType(true)
    			.get().body().text();

		RosreestrObject ro = gson.fromJson(result, RosreestrObject.class);
		
		// Если поле status != 200, значит в процессе выполнения возникли ошибки. Текст ошибки выводится в поле note.
		if (ro != null && ro.getStatus() != Response.Status.OK.getStatusCode()) {
			
		}

		return ro;
	}
	
	/*private String searchPkk5ByCn(String id) throws IOException {
		String result = Jsoup.connect(PKK5_API_URL.concat(String.valueOf(ROSREESTR_OBJECT_TYPES.get("Земельные участки"))))
				.ignoreContentType(true)
    			.get().body().text();

		RosreestrObject ro = gson.fromJson(result, RosreestrObject.class);
		
		// Если поле status != 200, значит в процессе выполнения возникли ошибки. Текст ошибки выводится в поле note.
		if (ro.getStatus() != Response.Status.OK.getStatusCode()) {

		}
		
		return result;
	}*/
}