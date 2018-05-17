package com.webservice.matrixparam;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType; 
 
@Path("/helloTest")
public class matrixService {		
 @GET
 @Path("{name}")
 @Produces(MediaType.TEXT_PLAIN)  
 public Response getMassegeWithMultiParam(
  @PathParam("name") String name,
  @MatrixParam("class") String className, 
  @MatrixParam("rollNo") String rollNo) {		 
	String output = "Student Name: " + name + ", Class: " 
			+className+ ", Roll No.: " + rollNo; 
	
	return Response.status(200).entity(output).build(); 
 }
}
