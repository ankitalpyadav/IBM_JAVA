package com.ibm.bank;

public class Current extends Account {
	
	private double overdraft;

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OD_LIMIT ;
		
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: "+ overdraft);
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		if (overdraft > OD_LIMIT) {
		balance += overdraft - OD_LIMIT;
        overdraft = OD_LIMIT;
		}
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CUR_BAL) {
				overdraft += balance;
				balance = MIN_CUR_BAL;
			}
			else 
				throw new BalanceException("Insufficient Balance");
		}
        
	}
	
	

}
