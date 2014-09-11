package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VinegarTest {
private Food food;
	
	@Before
	public void setUp() {
		food = new Vinegar();
	}
	
	@Test
	public void testGetPrice() {
		assertTrue(1.26 == food.getPrice());
	}
}
