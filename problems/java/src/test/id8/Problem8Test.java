package id8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem8Test {
	
	private Problem8 pro;
	
	@Before
	public void setUp() {
		pro = new Problem8("66666");
	}
	
	@Test
	public void testTopFive() {
		int product = pro.topFive();
		assertEquals("Wrong top five", 7776, product);
	}

}
