package com.mhallman.camel_jaxrs.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import com.mhallman.camel_jaxrs.domain.Person;

public class PersonProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
			Message inMessage = exchange.getIn();
			
			Person newPerson = new Person();
			newPerson.setAge(22);
			newPerson.setFirstName("Marcin");
			newPerson.setLastName("Hallman");
			
			inMessage.setBody(newPerson, Person.class);
	}

}
