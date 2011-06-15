package id10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Problem10 {
	
	private int limit;
	private boolean[] primes;
	
	public Problem10(int limit) {
		this.limit = limit;
		primes = new boolean[2000001];
		
		fillSieve();
	}
	
	public List<Integer> listPrimes() {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < limit; ++i) {
			if (primes[i])
				list.add(i);

		}
		
		return list;
	}
	
	public long sum(List<Integer> list) {
		Iterator<Integer> i = list.iterator();
		long sum = 0;
		
		while (i.hasNext()) {
			sum += i.next();
		}
		
		return sum;
	}
	
	private void fillSieve() {
	    Arrays.fill(primes,true);        // assume all integers are prime.
	    primes[0] = primes[1] = false;   // we know 0 and 1 are not prime.
	    
	    for (int i = 2; i < primes.length; ++i) {
	        //if the number is prime, 
	        //then go through all its multiples and make their values false.
	        if(primes[i]) {
	            for (int j=2; i*j < primes.length; ++j) {
	                primes[i*j] = false;
	            }
	        }
	    }
	}

}
