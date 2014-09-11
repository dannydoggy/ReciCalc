package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PastaTest {
	private Food food;
	@Before
	public void setUp() {
		food = new Pasta();
	}
	
	@Test
	public void testGetPrice() {
		assertTrue(0.31 == food.getPrice());
	}
}
