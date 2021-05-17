package com.cg.util;

public class InvalidFlightException extends Exception {

	public InvalidFlightException() {
		super("No such flight exist");
	}

	public InvalidFlightException(String message) {
		super(message);
	}

}
