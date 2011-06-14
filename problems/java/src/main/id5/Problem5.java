package id5;

public class Problem5 {
	
	private int limit;
	
	public Problem5(int limit) {
		this.limit = limit;
	}
	
	public int smallestNumber() {
		int start = limit;
		
		while (!isDivisible(start))
			start += 2;
		
		return start;
	}
	
	private boolean isDivisible(int num) {
		for (int i = limit; i > 0; --i) {
			if (num % i != 0)
				return false;
		}
		
		return true;
	}

}
