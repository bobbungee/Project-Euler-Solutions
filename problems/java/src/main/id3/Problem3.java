package id3;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
	
	public List<Long> primes(long n, long factor) {
	    List<Long> factors = new ArrayList<Long>();
	    
	    while (n % factor != 0)
	        factor++;

	    factors.add(factor);

	    if (n > factor)
	        factors.addAll(primes(n / factor, factor));

	    return factors;
	}
	
	public long largest(List<Long> list) {
		return list.get(list.size()-1);
	}
	
}
