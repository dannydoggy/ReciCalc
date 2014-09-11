package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LemonTest {
private Food food;
	
	@Before
	public void setUp() {
		food = new Lemon();
	}
	
	@Test
	public void testGetPrice() {
		assertTrue(2.03 == food.getPrice());
	}
}
