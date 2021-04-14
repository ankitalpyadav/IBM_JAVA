package com.ibm.bank;

public class Transaction {

	private String type;
	private double amount;
	private double balance;
	
	public Transaction() {
	}

	public Transaction(String type, double amount, double balance) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public void print() {
		System.out.printf("%-10s\t%.2f\t%.2f\n" , type , amount, balance);
	}
	
	
}
