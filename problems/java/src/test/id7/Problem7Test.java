package id7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem7Test {
	
	private Problem7 pro;
	
	@Before
	public void setUp() {
		pro = new Problem7(6);
	}
	
	@Test
	public void testPrime() {
		int prime = pro.prime();
		assertEquals("Wrong prime", 13, prime);
	}

}
