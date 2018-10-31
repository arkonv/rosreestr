package ru.smartsarov.rosreestr;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jsoup.Jsoup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.smartsarov.rosreestr.json.Xy;

// TODO план https://pkk5.rosreestr.ru/plan.html?id=52:18:70075&type=2

@Path("/")
//@Produces(MediaType.TEXT_PLAIN)
public class Pkk5 {
	private Gson gson = new GsonBuilder().create();

	@GET
	@Path("/convert/{coords}")
	@Produces(MediaType.TEXT_HTML + ";charset=utf-8")
	public Response index(@PathParam("coords") String coords) {
		String WebMercatorCoordinates;
		try {
			WebMercatorCoordinates = wgs84toWebMercator(coords);
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.toString()).build();
		}
		return Response.status(Response.Status.OK).entity(WebMercatorCoordinates).build();
	}

	@GET
	@Path("/map/{coords}")
	//@Produces("image/png")
	public Response export(@PathParam("coords") String coords) {
		//return Response.status(Response.Status.OK).entity("").build();
		
		Response resp;
		try {
			resp = getImage(coords);
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_HTML + ";charset=utf-8").entity(e.toString()).build();
		}

		return resp;
	}

	private String wgs84toWebMercator(String coords) throws Exception {
		/*String pkk5GeometryServerURL = "http://pkk5.rosreestr.ru/arcgis/rest/services/Utilities/Geometry/GeometryServer/project";
		String result = Jsoup.connect(pkk5GeometryServerURL)
				.timeout(40000)
				.ignoreContentType(true)
  				.data("inSR", "4326")
  				.data("outSR", "102100")
  				.data("f", "pjson")
  				.data("geometries", coords)
    			.get().body().text();
		return gson.fromJson(result, GeometryCoordinates.class).getGeometryCoordinates();*/

		String[] co = coords.split(",");
		String matchPattern = "\\d{1,3}(\\.\\d{0,15})?";
		if (co.length != 4 || !coords.matches("(" + matchPattern + ", {0,}){3}" + matchPattern + " {0,}")) {
			throw new Exception("Координаты переданы в неправильном формате. Поддерживаемый формат n{2,3}.n{0,15},n{2,3}.n{0,15},n{2,3}.n{0,15},n{2,3}.n{0,15}. Например, 43.196634229962015,54.696783302129496,43.584775099103013,55.084924171270494");
		}

		return getXY(co[0], co[1]).concat(",").concat(getXY(co[2], co[3]));
	}

	private String getXY(String x, String y) throws IOException {
		//String pkk5GeometryServerURL = "https://epsg.io/trans?x=43.19663416666666&y=54.69678333333333&s_srs=4326&t_srs=3857";
		String epsgIoTrans = "http://epsg.io/trans";

		String result = Jsoup.connect(epsgIoTrans)
				//.timeout(40000)
				//.validateTLSCertificates(false)
				.ignoreContentType(true)
  				.data("x", x)
  				.data("y", y)
  				.data("s_srs", "4326")
  				.data("t_srs", "3857")
    			.get().body().text();

		return gson.fromJson(result, Xy.class).getXy();
	}

	private Response getImage(String coords) throws Exception {
		String MapServerExportURL = "https://pkk5.rosreestr.ru/arcgis/rest/services/Cadastre/Cadastre/MapServer/export";
		// http://cpkk5.rosreestr.ru/arcgis/rest/services/Cadastre/Cadastre/MapServer/export?layers=show%3A0%2C1%2C2%2C4%2C5%2C6%2C7%2C8%2C9%2C10%2C11%2C12%2C13%2C14%2C15%2C16%2C17%2C18%2C19%2C20%2C23%2C24%2C29%2C30%2C31%2C32%2C33%2C34%2C35%2C38%2C39&dpi=96&format=PNG32&bbox=4794130.414015032%2C7337954.715391792%2C4813698.293256011%2C7357522.594632771&bboxSR=102100&imageSR=102100&size=1024%2C1024&transparent=true&f=image
		//https://pkk5.rosreestr.ru/arcgis/rest/services/Cadastre/Cadastre/MapServer/export?layers=show%3A0%2C1%2C2%2C4%2C5%2C6%2C7%2C8%2C9%2C10%2C11%2C12%2C13%2C14%2C15%2C16%2C17%2C18%2C19%2C20%2C23%2C24%2C29%2C30%2C31%2C32%2C33%2C34%2C35%2C38%2C39&dpi=96&format=PNG32&bbox=4794130.414015032%2C7337954.715391792%2C4813698.293256011%2C7357522.594632771&bboxSR=102100&imageSR=102100&size=1024%2C1024&transparent=true&f=image
			
		/*https://apkk5.rosreestr.ru/arcgis/rest/services/Cadastre/Cadastre/MapServer/export?
		layers=show%3A0%2C1%2C2%2C4%2C5%2C6%2C7%2C8%2C9%2C10%2C11%2C12%2C13%2C14%2C15%2C16%2C17%2C18%2C19%2C20%2C23%2C24%2C29%2C30%2C31%2C32%2C33%2C34%2C35%2C38%2C39
				&dpi=96
				&format=PNG32
				&bbox=4891969.810251281%2C7621688.964371494%2C4901753.749871782%2C7631472.903991994
				&bboxSR=102100
				&imageSR=102100
				&size=1024
				%2C1024
				&transparent=true
				&f=image*/
		
		String redirectUrl = MapServerExportURL
							//.concat("?layers=show:0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,23,24,29,30,31,32,33,34,35,38,39")
							.concat("?layers=show%3A0%2C1%2C2%2C4%2C5%2C6%2C7%2C8%2C9%2C10%2C11%2C12%2C13%2C14%2C15%2C16%2C17%2C18%2C19%2C20%2C23%2C24%2C29%2C30%2C31%2C32%2C33%2C34%2C35%2C38%2C39")
							.concat("&dpi=96")
							.concat("&format=PNG32")
							.concat("&bbox=").concat(wgs84toWebMercator(coords).replace(",", "%2C"))
							//.concat("&bbox=").concat(coords.replace(",", "%2C"))
							.concat("&bboxSR=102100")
							.concat("&imageSR=102100")
							.concat("&size=1024%2C1024")
							.concat("&transparent=true")
							.concat("&f=image");

		/*org.jsoup.Connection.Response resultImageResponse = Jsoup.connect(MapServerExportURL)
				.timeout(30000)
				.ignoreContentType(true)
  				.data("layers", "show:0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,23,24,29,30,31,32,33,34,35,38,39")
  				.data("dpi", "96")
  				.data("format", "PNG32")
  				.data("bbox", wgs84ToWebMercator(coords))
  				.data("bboxSR", "102100")
  				.data("imageSR", "102100")
  				.data("size", "1024,1024")
  				.data("transparent", "true")
  				.data("f", "image")
    			.execute();*/
		//String a = resultImageResponse.contentType();
		
		return Response.temporaryRedirect(new URI(redirectUrl)).build();
	}
	
	/*public List<Double> convertGpsToECEF(double lat, double longi, float alt) {
	    double a=6378.1;
	    double b=6356.8;
	    double e= 1-(Math.pow(b, 2)/Math.pow(a, 2));
	    double N = a/(Math.sqrt(1.0-(e*Math.pow(Math.sin(Math.toRadians(lat)), 2))));
	    double cosLatRad=Math.cos(Math.toRadians(lat));
	    double cosLongiRad=Math.cos(Math.toRadians(longi));
	    double sinLatRad=Math.sin(Math.toRadians(lat));
	    double sinLongiRad=Math.sin(Math.toRadians(longi));
	    double x =(N+0.001*alt)*cosLatRad*cosLongiRad;
	    double y =(N+0.001*alt)*cosLatRad*sinLongiRad;
	    double z =((Math.pow(b, 2)/Math.pow(a, 2))*N+0.001*alt)*sinLatRad;

	    List<Double> ecef= new ArrayList<>();
	    ecef.add(x);
	    ecef.add(y);
	    ecef.add(z);

	    return ecef;
	}*/
}