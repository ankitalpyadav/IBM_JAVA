package com.ibm.social;

public class Comment {
	private String message;
	
	public Comment() {
	}

	public Comment(User u, String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
