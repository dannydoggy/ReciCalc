package food;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BaconTest {

	private Food f;
	@Before
	public void setUp()
	{
		f= new Bacon();
	}
	@Test
	public void testGetPrice()
	{
		assertTrue(f.getPrice()==0.24);
	}
	
}
