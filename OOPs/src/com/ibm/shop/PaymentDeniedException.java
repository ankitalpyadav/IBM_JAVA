package com.ibm.shop;

public class PaymentDeniedException extends Exception {

	public PaymentDeniedException() {
		super();
	}

	public PaymentDeniedException(String message) {
		super(message);
	}

}
