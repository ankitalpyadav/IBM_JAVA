package com.ibm.bank;

public interface Banking {

	void summary();
	void statement();
	
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
}
