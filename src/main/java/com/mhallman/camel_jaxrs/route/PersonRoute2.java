package com.mhallman.camel_jaxrs.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.mhallman.camel_jaxrs.domain.Person;

public class PersonRoute2 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs:bean:rsServer").process(new Processor(){

			@Override
			public void process(Exchange arg0) throws Exception {
				String person = (String) arg0.getIn().getBody();
				System.out.println(person);
			}

		}).to("cxfrs://bean://rsClient?ignoreDeleteMethodMessageBody=true");

	}

}
