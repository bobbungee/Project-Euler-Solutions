package id7;

import java.util.Arrays;

public class Problem7 {
	
	private int number;
	private boolean[] primes;
	
	public Problem7(int number) {
		this.number = number;
		primes = new boolean[100000000];
		
		fillSieve();
	}
	
	public int prime() {
		int count 		= 0;
		int primenum 	= 0;
		
		for (int x = 0; x < primes.length; ++x) {
			
			if (primes[x])
				count++;
			
			if (count == number) {
				primenum = x;
				break;
			}
		}
		
		return primenum;
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
