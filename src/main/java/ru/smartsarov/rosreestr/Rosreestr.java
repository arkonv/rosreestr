package ru.smartsarov.rosreestr;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.TEXT_HTML + ";charset=UTF-8")
public class Rosreestr
{
	@GET
	//@Path("/")
    public Response index()
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@Path("/test")
    public Response getMsg()
    {
		return Response.status(Response.Status.OK).entity("Working").build();
    }
}