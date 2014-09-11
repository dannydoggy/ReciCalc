package food;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProduceTest {
 private FoodType foodtype;
 @Before
 public void setUp()
 {
	 foodtype= new Produce();
 }
 @Test
 public void testGetTax()
 {
	 assertTrue(0==foodtype.getTax());
 }
}
