package kr.co.bizframe.camel.cxf.hello;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.codec.binary.Base64;

public class WsEncodeProcessor implements Processor	{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("==>WsEncodeProcessor");

		try {
			byte[] bytes = exchange.getIn().getBody(byte[].class);
			String s = new String(bytes);
			System.out.println("body = " + s);
			exchange.getIn().setBody(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
