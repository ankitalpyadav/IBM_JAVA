import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Banking;
//import com.ibm.bank.Savings;

public class TestAccount {

	public static void main(String[] args) {
		
//		Account a1 = new Account("Ankita",1000);
//		a1.deposit(200);
//		a1.withdraw(100);
//		a1.summary();
		
//		
//		Savings s1 = new Savings("Mona");
//		s1.withdraw(5);
//		s1.summary();
		
//		Current c1 = new Current("Ankita");
//		//c1.deposit(1000);
//		c1.withdraw(3000);
//		c1.withdraw(7000);
//		c1.deposit(2000);
//		c1.deposit(4000);
//		
//		c1.summary();
		
//		Transaction t = new Transaction("Savings", 10000, 1000);
//		t.print();
		
		Banking s1 = AccountFactory.openSavingAccount("Polo");
		try {
			s1.withdraw(2000);
		} catch (BalanceException e) {
			//e.printStackTrace(); 	//For debugging - used by developers
			//System.out.println(e); 	//used for loggers
			System.out.println(e.getMessage());  	//for end user
		}
		
		s1.deposit(3000);
//		s1.withdraw(2000);
//		s1.deposit(4000);
//		
//		s1.statement();
		

	}

}
