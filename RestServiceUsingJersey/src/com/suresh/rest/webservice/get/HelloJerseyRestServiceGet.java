package com.suresh.rest.webservice.get;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hellojersey")
public class HelloJerseyRestServiceGet {
	
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHello(@QueryParam("name") String name) {
		 return "Hello " + name + " !"; 
	  }
}


