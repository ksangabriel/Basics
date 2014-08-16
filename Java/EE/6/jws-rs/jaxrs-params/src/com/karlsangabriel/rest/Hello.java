package com.karlsangabriel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/")
public class Hello {

	@GET
	public String hello(@QueryParam("name") String name) {
		return "Hi, " + name;
	}
	
	@GET
	@Path("{fname}/{lname}/{mname}")
	public String names(@PathParam("fname") String fname, @PathParam("lname")String lname, @PathParam("mname") String mname) {
		return "Hi, " + fname + " " + mname + " " + lname;
	}
	
	@GET
	@Path("matrix")
	public String nameMatrix(@MatrixParam("fname") String fname, 
			@MatrixParam("lname")String lname, 
			@MatrixParam("mname") String mname) {
		return "Hi, " + fname + " " + mname + " " + lname;
	}
	
	@GET
	@Path("header")
	public String header(@HeaderParam("host") String host) {
		return "Host is: " + host;
	}
}
