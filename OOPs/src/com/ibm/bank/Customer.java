package com.ibm.bank;

public class Customer {

	private int custId;
	private String custName;
	private int credLimit;
	
	private static int autoID;
	
	static {
		autoID = 1001;
	}
	public Customer(String custName, int credLimit) {
		super();
		this.custId = autoID++;
		this.custName = custName;
		this.credLimit = credLimit;
	}
	
	public void display()
	{
		System.out.println("-------------- Customer -------------");
		System.out.println("Customer ID :" + custId);
		System.out.println("Customer Name :" + custName);
		System.out.println("Customer Credit Limit :" + credLimit);
	}

	public int getCredLimit() {
		return credLimit;
	}

	
	
	
	
}
