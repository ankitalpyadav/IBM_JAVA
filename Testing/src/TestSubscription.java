import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSubscription {
	private Subscription subs;
	
	@BeforeEach
	public void init() {
		subs = new Subscription();
	}
	
	@Test
	public void monthlySub() {
		assertEquals(100, subs.monthly());
	}
	
	@Test
	public void quarterlySub() {
		assertEquals(250, subs.quaterly());
	}
	@Test
	public void anuallySub() {
		assertEquals(1000, subs.anually());
	}
}
