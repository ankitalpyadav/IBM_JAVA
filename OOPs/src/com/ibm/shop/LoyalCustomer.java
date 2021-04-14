package com.ibm.shop;
import com.ibm.bank.Customer;

public class LoyalCustomer extends Customer {
	
	private static double discount;

	

	public LoyalCustomer(String custName, int credLimit, double discount) {
		super(custName, credLimit);
		LoyalCustomer.discount = discount;
		
	}
	
	@Override
	public void display() {
		
		super.display();
		System.out.println("Discount: "+ discount);
	}

	@Override
	public int getCredLimit() {
		return (int) (super.getCredLimit() - discount);
	}

	
}
