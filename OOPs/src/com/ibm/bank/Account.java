package com.ibm.bank;

import java.util.ArrayList;

/**
 * This class represents generalized bank account
 * @author Ankita Yadav
 * @version 1.0
 */
public abstract class Account implements Banking {
	
	private int acnNo;
	private String holder;
	protected double balance;
	
	//application constants
	public static final int INIT_ACNT_NO = 1001;
	public static final double MIN_SAV_BAL = 1000;
	public static final double OD_LIMIT = 10000;
	public static final double INIT_CUR_BAL = 5000;
	public static final double MIN_CUR_BAL = 0;
	
	private static int autoNo = INIT_ACNT_NO;
	
//	protected Transaction[] txns;
//	protected int idx;

	ArrayList<Transaction> txns = new ArrayList<Transaction>(10);
	
	//This is default constructor
	public Account() {
		
	}
	
	/** This is parameterized constructor*/
	public Account(String holder, double balance) {
		super();
		this.acnNo = autoNo++;
		this.holder = holder;
		this.balance = balance;
		
		txns.add(new Transaction("OB", balance, balance));
//		txns = new Transaction[10];
//		txns[idx ++] = new Transaction("OB", balance, balance);
	}
	
	public void summary() {
		System.out.println(acnNo + "," + holder + "," + balance);
		
	}
	
	//BL methods
	public void deposit(double amount){
        balance  += amount;
//        txns[idx++] = new Transaction("CR", amount, balance);
        txns.add(new Transaction("CR", amount, balance));
        
	}
	
	public abstract void withdraw(double amount) throws BalanceException;

	
	public void statement() {
		System.out.println("Statement for A/C: "+ acnNo);
//		for (int i = 0; i<idx; i++)
//			txns[i].print();
		
		for (Transaction t : txns) {
			t.print();
		}
	}
	
	

}
