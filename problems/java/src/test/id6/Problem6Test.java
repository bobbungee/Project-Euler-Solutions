package id6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem6Test {
	
	private Problem6 pro;
	
	@Before
	public void setUp() {
		pro = new Problem6(10);
	}
	
	@Test
	public void testSumOfSquare() {
		int num = pro.sumOfSquare();
		assertEquals("Wrong sum of squares", 385, num);
	}
	
	@Test
	public void testSquareOfSums() {
		int num = pro.squareOfSums();
		assertEquals("Wrong square of sums", 3025, num);
	}
	
	@Test
	public void testDifference() {
		int difference = pro.difference(3025, 385);
		assertEquals("Wrong difference", 2640, difference);
	}

}
