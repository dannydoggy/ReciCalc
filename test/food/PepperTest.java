package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PepperTest {
	private Food food;
	@Before
	public void setUp() {
		food = new Pepper();
	}
	
	@Test
	public void testGetPrice() {
		assertTrue(0.17 == food.getPrice());
	}
}
