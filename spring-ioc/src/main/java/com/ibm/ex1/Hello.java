package com.ibm.ex1;

public class Hello {
	
	private String message;
	
	public Hello() {
		System.out.println("Default constructor");
	}
	
	public Hello(String message) {
		this.message = message;
		System.out.println("Parameterized constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter metho");
	}
	
}
