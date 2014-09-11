package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MeatTest {
private FoodType food;
	
	@Before
	public void setUp() {
		food = new Meat();
	}
	
	@Test
	public void testGetTax() {
		assertTrue(0.086 == food.getTax());
	}
}
