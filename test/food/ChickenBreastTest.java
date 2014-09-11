package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ChickenBreastTest {

private Food food;
	
	@Before
	public void setUp() {
		food = new ChickenBreast();
	}
	
	@Test
	public void testGetPrice() {
		assertTrue(2.19 == food.getPrice());
	}
}
