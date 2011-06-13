package id1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Problem1Test {
	
	private Problem1 prob;
	private List<Integer> ans;
	
	@Before
	public void setUp() {
		prob = new Problem1(10);
		
		ans	= new ArrayList<Integer>();
		ans.add(3);
		ans.add(5);
		ans.add(6);
		ans.add(9);
	}
	
	@Test
	public void testMultiples() {
		List<Integer> nums 	= prob.multiples();
		assertEquals("Wrong numbers", ans, nums);
	}
	
	@Test
	public void testSum() {
		int sum = prob.sum(ans);
		assertEquals("Sum not right", 23, sum);
	}

}
