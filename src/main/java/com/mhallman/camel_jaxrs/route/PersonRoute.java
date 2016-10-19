package com.mhallman.camel_jaxrs.route;

import org.apache.camel.builder.RouteBuilder;

public class PersonRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:D:/camel/input?noop=true").to("log:body?level=INFO").choice()
		.when(header("CamelFileName").endsWith(".xml")).
			to("jms:incomingXmlFiles")
		.when(header("CamelFileName").endsWith(".txt")).
			to("jms:incomingTxtFiles");
	}

}
