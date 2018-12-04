package ru.smartsarov.rosreestr;

import static ru.smartsarov.geocoder.Constants.YANDEX_GEOCODER_URL;
import static ru.smartsarov.rosreestr.Constants.GIS_ZHKH_KRSN_URL;
import static ru.smartsarov.rosreestr.Constants.PKK5_API_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_API_ADDRESS_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_API_NUMBER_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_API_OBJECT_ID_URL;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_AREA_TYPES;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_OBJECT_TYPES;
import static ru.smartsarov.rosreestr.Constants.ROSREESTR_UNITS;
import static ru.smartsarov.rosreestr.Constants.UTIL_NAMES;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jsoup.Jsoup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ru.smartsarov.rosreestr.geocoder.data.Thoroughfare;
import ru.smartsarov.rosreestr.geocoder.data.YaGeocoderResp;
import ru.smartsarov.rosreestr.json.FirObjects;
import ru.smartsarov.rosreestr.json.firobject.FirObject;
import ru.smartsarov.rosreestr.json.firobject.FirObjectSerializer;
import ru.smartsarov.rosreestr.json.object.RosreestrObject;
import ru.smartsarov.rosreestr.json.type.Attrs;
import ru.smartsarov.rosreestr.json.type.RosreestrType;

// TODO заменить searchRosreestrById, searchRosreestrByNumber, searchPkk5ById на одну функцию. Добавить <T>
// TODO обработать исключение 503 от jsoup, перенаправить запросы с ПКК5 на РР

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class Rosreestr {
	public class A {
		private String objectId;

		public String getObjectId() {
			return objectId;
		}
	}

	private Gson gson = new GsonBuilder().create();

	@GET
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
		return searchByText1(text, null);
	}
	
	@GET
	@Path("/search/raw/{text}")
	public Response searchRawByText(@PathParam("text") String text) {
		return searchByText1(text, null);
	}
	
	@GET
	@Path("/search/{text}&{bbox}")
    public Response searchByText1(@PathParam("text") String text, @QueryParam("bbox") String bbox) {
		String result;
		RosreestrObject ro;
		boolean isCadNumberMask;
		boolean isAddress;
		boolean isCoords;
		ru.smartsarov.rosreestr.json.object.Attrs attributes;

		try {
			if (text.matches("\\d{1,3}(\\.\\d{1,})?[, ] ?\\d{1,3}(\\.\\d{1,})?")) {
				isCoords = true;
			} else if (text.matches("\\d{2,3}:\\d{1,2}:\\d{4,7}:\\d{2,}")) {
				isCadNumberMask = true;
				
				List<A> ObjectIds = gson.fromJson(searchRosreestrByNumber(text), new TypeToken<List<A>>(){}.getType());				
				//searchRosreestrById(ObjectIds.get(0).getObjectId());
				if (ObjectIds == null) {
					// TODO В случае отсутствия данных возвращать не null, а json как у Трассира
					return Response.status(Response.Status.OK).entity(null).build();	
				}
				
				Gson gson1 = new GsonBuilder().registerTypeAdapter(FirObject.class, new FirObjectSerializer()).create();
				FirObject fir = gson1.fromJson(searchRosreestrById(ObjectIds.get(0).getObjectId()), FirObject.class);
				return Response.status(Response.Status.OK).entity(gson1.toJson(fir).toString()).build();
				
				//return Response.status(Response.Status.OK).entity(searchRosreestrById(ObjectIds.get(0).getObjectId())).build();
			} else {
				isAddress = true;
			}
			
			// 0. Ищем на РР по кадастровому номеру
			/*52:18:70009:39
			АА:ВВ:CCCCСCC:КК
			АА — кадастровый округ (области, края)
			ВВ — кадастровый район (районы области)
			CCCCCCС — кадастровый квартал состоит из 6 или 7 цифр.
			КК — номер земельного участка.
			У id в CCCCСCC отсутствуют 2 ведущих нуля*/
			/*if (isCadNumberMask) {
				RosreestrType t = searchRosreestrByNumber(text);
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
				// если isCoords - один вариант
				// если isCadNumberMask - другой вариант
				// если isAddress - третий вариант
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
			
			attributes = ro.getFeature().getAttrs();
			attributes.setAreaType(ROSREESTR_AREA_TYPES.get(attributes.getAreaType()));
			attributes.setAreaUnit(ROSREESTR_UNITS.get(attributes.getAreaUnit()));
			attributes.setCadUnit(ROSREESTR_UNITS.get(attributes.getCadUnit()));
			String utilCode = attributes.getUtilCode();
			if (utilCode != null) {
				attributes.setUtilCodeDesc(UTIL_NAMES.getOrDefault(utilCode, null));
			}
		} catch (IOException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.toString()).build();
		}

		// сделать метод, обнуляющий ненужные поля у ro
	
		result = gson.toJson(attributes, ru.smartsarov.rosreestr.json.object.Attrs.class);
		
		return Response.status(Response.Status.OK).entity(result).build();
    }

	private String searchRosreestrByNumber(String number) throws IOException {
		/*String doc = Jsoup.connect(ROSREESTR_API_NUMBER_URL.concat(number))
				.ignoreContentType(true)
    			.get().body().text();*/

		org.jsoup.Connection.Response response = Jsoup.connect(ROSREESTR_API_NUMBER_URL.concat(number)).ignoreContentType(true).execute();
		if (Arrays.asList(Response.Status.NO_CONTENT.getStatusCode(), Response.Status.NOT_FOUND.getStatusCode()).contains(response.statusCode())) {
			// данные не найдены
			return null;
		}
		String r = response.body();
		
		/*String result = Jsoup.connect(ROSREESTR_API_NUMBER_URL.concat(number))
				.ignoreContentType(true)
    			.get().body().text();*/

		/*RosreestrObject ro = gson.fromJson(result, RosreestrObject.class);
		
		// Если поле status != 200, значит в процессе выполнения возникли ошибки. Текст ошибки выводится в поле note.
		if (ro != null && ro.getStatus() != Response.Status.OK.getStatusCode()) {
			
		}*/
		
		return r;
	}
	
	private String searchRosreestrById(String id) throws IOException {
		String result = Jsoup.connect(ROSREESTR_API_OBJECT_ID_URL.concat(id))
				.ignoreContentType(true)
    			.get().body().text();

		//FirObject fo = gson.fromJson(result, FirObject.class);
		/*if (result.contains("\"\"")) {
			result.replace("\"\"", "'");
			result.matches(".\".\"\"");
			//if 
		}*/
		
		return result/*.replace("\"", "\\\"")*/;
	}
	
	private String searchRosreestrByAddress(String coords) throws IOException {

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
	
	@GET
	@Path("/searchaddr/{coords}")
	public String searchRosreestrByAddressKrsn(@PathParam("coords") String coords) throws IOException {
		String url = YANDEX_GEOCODER_URL.concat(coords);
		String resp = Jsoup.connect(url).ignoreContentType(true).data("sco", "latlong")./*data("kind", "house").*/get().body().text();

		YaGeocoderResp yandexGeo = gson.fromJson(resp, YaGeocoderResp.class);		
		Thoroughfare thoroughfare = yandexGeo.response.geoObjectCollection.featureMember.get(0).geoObject.metaDataProperty.geocoderMetaData.addressDetails.country.administrativeArea.subAdministrativeArea.locality.thoroughfare;
		String street = thoroughfare.thoroughfareName;
		String house = thoroughfare.premise.premiseNumber;

		// вызываем ROSREESTR_API_ADDRESS_URL
		String result = Jsoup.connect(ROSREESTR_API_ADDRESS_URL)
				.ignoreContentType(true)
  				.data("macroRegionId", "104000000000")
  				.data("RegionId", "104401000000")
  				//.data("settlementId", "204401000000")
  				.data("street", street)
  				.data("house", house)
    			.get().body().text();
		
		return result;
	}

	/**
	 * <b>Поиск по маске кадастрового номера, адресу, координатам</b>
	 * <br> http://pkk5.rosreestr.ru/api/features/type_id
	 * 
	 * @param text может принимать значения маски кадастрового номера, адреса, координат [x y]<br>Примеры: text=61:26:0600024:*, text=арзамас ленина 20, text=56.309636 44.024316
	 * @return {@link RosreestrType}
	 * @throws IOException
	 */
	private RosreestrType searchPkk5ByText(String text) throws SocketTimeoutException {
		String result = null;
		String pkk5Http = PKK5_API_URL.concat(String.valueOf(ROSREESTR_OBJECT_TYPES.get("Земельные участки")));
		
		try {
			result = Jsoup.connect(pkk5Http)
				.ignoreContentType(true)
				.data("text", text)
				//.data("limit", "30")
    			.get().body().text();
		} catch(SocketTimeoutException e) {
			e.printStackTrace();
			throw new SocketTimeoutException("Ответ от ".concat(pkk5Http).concat(" не был получен за 30 секунд"));
			
			//searchRosreestrByAddress(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RosreestrType ro = gson.fromJson(result, RosreestrType.class);
		
		// Если поле status != 200, значит в процессе выполнения возникли ошибки. Текст ошибки выводится в поле note.
		if (ro != null && ro.getStatus() != Response.Status.OK.getStatusCode()) {
			
		}
		
		return ro;
	}
	
	/**
	 * http://pkk5.rosreestr.ru/api/features/type_id/object_id
	 * @param id
	 * @return
	 * @throws IOException
	 */
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
	
	@GET
	@Path("/houses")
	public Response getHouses() {
		try {
			Gson gson1 = new GsonBuilder().setLenient().create();
			String result;
			Properties props = new Properties();

			try (FileInputStream f = new FileInputStream("c:/conf/rosreestr/krsn/rosreestr.conf")) {
				props.load(f);
			}
			
			if (props.getProperty("housesFromAPI", "0").equals("1")) {
				result = Jsoup.connect(GIS_ZHKH_KRSN_URL)
					.maxBodySize(0)
					.ignoreContentType(true)
					.validateTLSCertificates(false)
					.timeout(30000)
	    			.get().body().text();
			} else {
				result = new String(Files.readAllBytes(Paths.get(this.getClass().getResource("/krsn/houses_cad.json").toURI())), StandardCharsets.UTF_8);
			}
			
			//Files.write(Paths.get("C:/1.txt"), result.getBytes(StandardCharsets.UTF_8));
			
			//TODO убрать 2 неправильных кадастровых номера, после доработки gson https://groups.google.com/forum/#!topic/google-gson/PSaZlHRAck0  https://alvinalexander.com/java/jwarehouse/gson/gson/src/test/java/com/google/gson/functional/StringTest.java.shtml
			List<GisZkhHouses> houses = gson1.fromJson(result, new TypeToken<List<GisZkhHouses>>(){}.getType());
			houses = houses.stream().filter(h -> !h.getCadastral().equals("") && h.getCadastral() != null && h.getCadastral() != "24:50:0400005:74" && h.getCadastral() != "24:50:0400003:63" && h.getCadastral().matches("\\d{2,3}:\\d{1,2}:\\d{4,7}:\\d{2,}")).collect(Collectors.toList());
			
			return Response.status(Response.Status.OK).entity(gson1.toJson(houses)).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.toString()).build();
		}
	}
}