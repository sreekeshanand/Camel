package com.sree.cgi;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {
	
	@Value("${camel.input.path}")
	private String input ;
	@Value("${camel.output.path}")
	private String output ;
	
	
	@Override
	public void configure() throws Exception {
		
		from("file:"+input)
		//.unmarshal().csv()
			.to("file:"+output);
	}

	
}
