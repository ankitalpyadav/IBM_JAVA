import com.ibm.xe.CurrencyConverter;
import com.ibm.xe.INR;
import com.ibm.xe.USD;

public class TestCurrency {

	public static void main(String[] args) {
		
		INR inr = new INR();
		USD usd = new USD();
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.convert(inr, usd, 1000));
		System.out.println(cc.convert(usd, inr, 100));
		
	}

}
