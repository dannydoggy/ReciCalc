package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CornTest {
	private Food food;
	
	@Before
	public void setUp() {
		food = new Corn();
	}
	
	@Test
	public void testGetPrice() {
		assertTrue(0.87 == food.getPrice());
	}
}
