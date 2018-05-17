package com.jersey.helloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/cts")
public class Hellojersey {
	
	@GET
@Path("/{urlvalue1}/f")
public double sayhii(@PathParam("urlvalue1") float a)
{
		
	double c=(a-32)*0.555;
	return c;
}
	@GET
	@Path("/{urlvalue2}/c")
	public double sayhi(@PathParam("urlvalue2") float b)
	{
			
		double f=(b*1.8)+32;
		return f;
	}

}
