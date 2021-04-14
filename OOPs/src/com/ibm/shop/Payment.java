package com.ibm.shop;

public class Payment {
	
	private String acntNo;
	private double balance;
	
	public Payment(String acntNo, double balance) {
		super();
		this.acntNo = acntNo;
		this.balance = balance;
	}

	public String getAcntNo() {
		return acntNo;
	}

	public void setAcntNo(String acntNo) {
		this.acntNo = acntNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
