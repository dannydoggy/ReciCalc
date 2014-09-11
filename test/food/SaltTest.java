package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SaltTest {
private Food food;
	
	@Before
	public void setUp() {
		food = new Salt();
	}
	
	@Test
	public void testGetPrice() {
		assertTrue(0.16 == food.getPrice());
	}
}
