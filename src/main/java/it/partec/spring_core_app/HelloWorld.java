package it.partec.spring_core_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	@Autowired
	private Message message;

	public void printMessage() {
		System.out.println("Il messaggio è " + message.getMessage());
	}
}
