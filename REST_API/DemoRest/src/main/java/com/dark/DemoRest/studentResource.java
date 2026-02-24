package com.dark.DemoRest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/studentData")
public class studentResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<student> getStudent() {
		
		return studentRepository.getStudentRepository(); 
	}
	
}
