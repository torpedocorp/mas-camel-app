package kr.co.bizframe.camel.cxf.hello.server;

public class HelloImpl implements Hello {

	@Override
	public String sayHello(String name){
		System.out.print("hello " + name);
		return "hello " + name ;
	}
}
