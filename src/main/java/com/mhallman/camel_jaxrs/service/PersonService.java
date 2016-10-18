package com.mhallman.camel_jaxrs.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mhallman.camel_jaxrs.domain.Person;
import com.mhallman.camel_jaxrs.repository.PersonRepository;

@Component
@Path("/person")
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	/*public PersonRepository getPersonRepository() {
		return personRepository;
	}


	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}*/


	@POST
	@Path("/createpost")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postPerson(Person person){
		String result = "Created: " + person;
		return Response.status(201).entity(result).build();
	}
	
	
	@GET
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(){
		return personRepository.create();
	}
}
