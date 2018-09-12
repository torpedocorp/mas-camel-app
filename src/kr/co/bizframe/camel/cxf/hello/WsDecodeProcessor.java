package kr.co.bizframe.camel.cxf.hello;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.commons.codec.binary.Base64;

public class WsDecodeProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("==>WsDecodeProcessor");

		try {
			Message msg = exchange.getIn();
			String s = exchange.getIn().getBody(String.class);
			System.out.println("body = " + s);
			//byte[] bytes = Base64.decodeBase64(exchange.getIn().getBody(String.class));
			//exchange.getIn().setBody(Base64.decodeBase64(bytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
