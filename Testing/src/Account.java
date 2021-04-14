
public class Account {
	public double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public double deposite(double amount) throws NumberFormatException {
		if (amount<0)
			throw new NumberFormatException("Negative amount");
		
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount) throws NumberFormatException, BalanceException{
		if (amount<0)
			throw new NumberFormatException("Negative amount");
		
		if(amount>balance)
			throw new BalanceException("Insufficient balance");
		
		balance -= amount;
		return balance;
	}
}
