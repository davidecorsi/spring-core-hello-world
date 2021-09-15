package it.partec.spring_core_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.printMessage();
	}
}
