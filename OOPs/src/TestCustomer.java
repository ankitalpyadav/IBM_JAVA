import com.ibm.bank.Customer;
import com.ibm.shop.LoyalCustomer;

public class TestCustomer {

	public static void main(String[] args) {
		
		
		Customer c1 = new Customer("Ankita",1000);
		c1.display();
		
		Customer c2 = new Customer("Ashwini",30000);
		c2.display();
		
		LoyalCustomer l1 = new LoyalCustomer("Shruti", 1000, 10);
		l1.display();
		

	}

}
