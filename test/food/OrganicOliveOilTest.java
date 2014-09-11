package food;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OrganicOliveOilTest {
	private Food food;
	@Before
	public void setUp()
	{
	food=new OrganicOliveOil();	
	}

	@Test
	public void TestGetPrice()
	{
		assertTrue(1.92==food.getPrice());
		}
	public void TestGetDiscount()
	{
		assertTrue(0.05==food.getDiscount());
		}
}
