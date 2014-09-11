package food;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrganicGarlicTest {
	private Food food;
@Before
public void setUp()
{
food=new OrganicGarlic();	
}

@Test
public void TestGetPrice()
{
	assertTrue(0.67==food.getPrice());
	}
public void TestGetDiscount()
{
	assertTrue(0.05==food.getDiscount());
	}
}
