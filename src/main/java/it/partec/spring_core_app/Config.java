package it.partec.spring_core_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Message message() {
		return new Message();
	}
	
	@Bean
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage(message());
		return helloWorld;
	}
}
