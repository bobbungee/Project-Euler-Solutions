package id5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem5Test {
	
	private Problem5 pro;
	
	@Before
	public void setUp() {
		pro = new Problem5(10);
	}
	
	@Test
	public void testSmallestNumber() {
		int num = pro.smallestNumber();
		assertEquals("Wrong smallest number", 2520, num);
	}

}
