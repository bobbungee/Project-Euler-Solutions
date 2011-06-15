package id10;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Problem10Test {

	private Problem10 pro;
	private List<Integer> primes;
	
	@Before
	public void setUp() throws Exception {
		pro = new Problem10(10);
		primes = new ArrayList<Integer>();
		
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
	}
	
	@Test
	public void testListPrimes() {
		List<Integer> ans = pro.listPrimes();
		assertEquals("Wrong primes", primes, ans);
	}
	
	@Test
	public void testSum() {
		long ans = pro.sum(primes);
		assertEquals("Wrong sum", 17L, ans);
	}

}
