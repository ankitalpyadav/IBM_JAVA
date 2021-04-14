import com.ibm.shop.OutOfStockException;
import com.ibm.shop.Payment;
import com.ibm.shop.PaymentDeniedException;
import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;

public class TestProductShopping {
	
	public static void main(String[] args) {
		
//		Product pro = new Product(12,"pen",1);
//		Product pro1 = new Product(120,"ball");
//		Product pro2 = new Product(150,"toy");
//		Product pro3 = new Product(50,"book");
		//Product pro4 = new Product(22,"Soap");
		
		Product pro = new Product("Pen", 100, 10);
		Product pro2 = new Product("Pen1", 200, 10);
		Payment pay = new Payment("101", 200);
		
		ShoppingCart sc = new ShoppingCart();
		
		
		try {
			sc.addProduct(pro);
			sc.addProduct(pro2);
//			sc.addProduct(pro);
//			sc.addProduct(pro);
//			sc.addProduct(pro);
		} catch (OutOfStockException e) {
			// TODO Auto-generated catch block
			e.getStackTrace();
		}
//		sc.addProduct(pro1);
//		sc.addProduct(pro2);
//		sc.addProduct(pro3);
		//sc.addProduct(pro4);
		
		try {
			sc.checkout(pay, "WKND100");
		} catch (PaymentDeniedException e) {
			e.printStackTrace();
		}
		
	}
}
