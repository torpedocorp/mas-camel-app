package kr.co.bizframe.camel.cxf.hello.client;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(locations = { "classpath:/cxf-client-route.xml" })
public class ClientProduerTest {
	
	@Produce(uri = "direct:hello")
	ProducerTemplate wsClient;
	
	public void send(){
		
		try {
			String response = (String)wsClient.requestBody("baebaebae");
			System.out.println(response);
			System.err.println("Response from Web Service : " + response);
		} catch (CamelExecutionException e) {
			e.printStackTrace();
		}
	}
}
