package id4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem4Test {
	
	private Problem4 pro;
	
	@Before
	public void setUp() {
		pro = new Problem4(2);
	}
	
	@Test
	public void testPalindrome() {
		int palindrome = pro.palindrome();
		assertEquals("Wrong palindrome", 9009, palindrome);
	}

}
