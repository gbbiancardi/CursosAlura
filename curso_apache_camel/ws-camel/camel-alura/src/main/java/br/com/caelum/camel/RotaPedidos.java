package br.com.caelum.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http4.HttpMethods;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaPedidos {

	public static void main(String[] args) throws Exception {

		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {

				from("file:pedidos?delay=5s&noop=true").
				    routeId("rota-pedidos").
			    to("seda:soap").
			    	log("Chamando soap com ${body}").
		        to("seda:http");

				from("seda:http").
				    routeId("rota-http").
				    setProperty("pedidoId", xpath("/pedido/id/text()")).
				    setProperty("email", xpath("/pedido/pagamento/email-titular/text()")).
				    split().
				        xpath("/pedido/itens/item").
				    filter().
				        xpath("/item/formato[text()='EBOOK']").
				    setProperty("ebookId", xpath("/item/livro/codigo/text()")).
				    marshal().xmljson().
//				    log("${id} - ${body}").
				    setHeader(Exchange.HTTP_METHOD, HttpMethods.GET).
				    setHeader(Exchange.HTTP_QUERY,
				            simple("clienteId=${property.email}&pedidoId=${property.pedidoId}&ebookId=${property.ebookId}")).
				to("http4://localhost:8080/webservices/ebook/item");
				
				from("seda:soap").
				    routeId("rota-soap").
				to("xslt:pedido-para-soap.xslt").
				    setHeader(Exchange.CONTENT_TYPE, constant("text/xml")).
			    to("http4://localhost:8080/webservices/financeiro");
			}

		});

		context.start();
		Thread.sleep(20000);
		context.stop();
	}
}
