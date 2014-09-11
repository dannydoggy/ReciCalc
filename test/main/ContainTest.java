package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import food.Corn;
import food.Food;



public class ContainTest {

	private Contain c;
	private Food food;
	@Before
	public void setUp()
	{
		food = new Corn();
		c= new Contain(1, food);
	}
	@Test
	public void TestGetNumber()
	{
		assertTrue(1==c.getNumber());
	}
	public void TestGetFood()
	{
		assertTrue(c.getFood().equals(food));
	}
}
