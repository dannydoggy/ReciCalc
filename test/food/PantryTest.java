package food;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PantryTest {
	private FoodType foodtype;
@Before
public void setUp()
{
	foodtype=new Pantry();
}
@Test
public void TestGetTax()
{
assertTrue(0.086==foodtype.getTax());	
}
}
