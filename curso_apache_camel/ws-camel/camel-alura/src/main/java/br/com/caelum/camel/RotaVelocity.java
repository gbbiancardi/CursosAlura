package br.com.caelum.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaVelocity {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		ProducerTemplate producer = context.createProducerTemplate();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {

				from("direct:entrada").
			    	setHeader("data", constant("8/12/2015")).
			    to("velocity:template.vm").
			    	log("${body}");
				producer.sendBody("direct:entrada", "Apache Camel rocks!!!");
			}
		});

		context.start();
		Thread.sleep(20000);
		context.stop();
	}

}
