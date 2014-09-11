package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestReciCal{
	private MockMenu m;
	private ReciCalc rc;
	
	@Before
	public void setUp() {
		m = new MockMenu();
		rc = new ReciCalc(m);
		
	}

	@Test
	public void testReciCalMethod() {
		assertTrue(0.19-rc.calcPrice("testMenu").getSaleTax()<1e-9);
		assertTrue(Math.abs(4.95-rc.calcPrice("testMenu").getTotal())<1e-9);
		assertTrue(0.1295-rc.calcPrice("testMenu").getWellnessDiscount()<1e-9);
		
	}
}
