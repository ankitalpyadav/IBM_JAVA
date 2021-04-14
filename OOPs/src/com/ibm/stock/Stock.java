package com.ibm.stock;

public class Stock implements Exchange {

	@Override
	public void get() {
		System.out.println("Get Quote");
		
	}

	@Override
	public void view() {
		System.out.println("View Quote");
		
	}

	@Override
	public void set() {
		System.out.println("Set Quote");
		
	}

}
