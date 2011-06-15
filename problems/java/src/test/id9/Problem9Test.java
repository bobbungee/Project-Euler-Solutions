package id9;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem9Test {
	
	private Problem9 pro;
	private int[] triplets;
	
	@Before
	public void setUp() {
		pro = new Problem9(12);
		triplets = new int[] {3, 4, 5};
	}
	
	@Test
	public void testTriplets() {
		int[] trips = pro.triplets();
		assertArrayEquals("Wrong triplets", triplets, trips);
	}
	
	@Test
	public void testProduct() {
		int product = pro.product(triplets);
		assertEquals("Wron product", 60, product);
	}

}
