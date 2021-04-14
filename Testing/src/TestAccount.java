import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestAccount {
	private Account ac;
	
	@BeforeEach
	public void init() {
		ac = new Account(100);
	}
	
	@Test
	@Disabled
	public void testDeposite() throws BalanceException {
		assertEquals(200, ac.deposite(100));
	}
	
	@Test
	@Disabled
	public void testWithdraw() throws NumberFormatException, BalanceException {
		assertEquals(50, ac.withdraw(50));
	}
	
	@Test
	@Disabled
	public void testNegativeDeposite() {
		assertEquals(150, ac.deposite(-50));
	}
	
	@Test
	@Disabled
	public void testNegativeWithdraw() throws NumberFormatException, BalanceException {
		assertEquals(50, new Account(10).withdraw(-20));
	}
	
	@Test
	@Disabled
	public void testInvalidWithdraw() throws NumberFormatException, BalanceException {
		assertEquals(3, new Account(10).withdraw(7));
	}
}
