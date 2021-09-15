package it.partec.spring_core_app;

public class HelloWorld {
	private Message message;
	
	public void setMessage(Message message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Il messaggio è " + message.getMessage());
	}
}
