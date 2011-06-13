package id2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Problem2Test {
	
	private Problem2 pro;
	private List<Integer> fibonacci;
	
	@Before
	public void setUp() {
		pro = new Problem2(89);
		fibonacci = new ArrayList<Integer>();
		
		fibonacci.add(1);
		fibonacci.add(2);
		fibonacci.add(3);
		fibonacci.add(5);
		fibonacci.add(8);
		fibonacci.add(13);
		fibonacci.add(21);
		fibonacci.add(34);
		fibonacci.add(55);
		fibonacci.add(89);
	}
	
	@Test
	public void testFibonacci() {
		List<Integer> fib = pro.fibonacci();
		assertEquals("Wrong fibonacci", fibonacci, fib);
	}
	
	@Test
	public void testSum() {
		int sum = pro.sum(fibonacci);
		assertEquals("Wrong sum", 44, sum);
	}

}
