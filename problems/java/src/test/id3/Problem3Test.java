package id3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Problem3Test {
	
	private Problem3 pro;
	private List<Long> primes;
	
	@Before
	public void setUp() {
		pro = new Problem3();
		primes = new ArrayList<Long>();
		
		primes.add(5L);
		primes.add(7L);
		primes.add(13L);
		primes.add(29L);
	}
	
	@Test
	public void testPrimes() {
		List<Long> ans = pro.primes(13195, 3);
		assertEquals("Wrong primes", primes, ans);
	}
	
	@Test
	public void testLargest() {
		long largest = pro.largest(primes);
		assertEquals("Wrong largest", 29L, largest);
	}

}
