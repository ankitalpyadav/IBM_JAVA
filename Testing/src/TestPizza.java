
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPizza {
	private Pizza pizza;
	
	@BeforeEach
	public void initOrder() {
		pizza = new Pizza();
	}
	
	@Test
	public void pizzaSize() {
		assertEquals(200, pizza.order("S", 2));
	}
	
	@Test
	public void testToppings() {
		assertEquals(350, pizza.order("Z", 3));
	}
	
}
