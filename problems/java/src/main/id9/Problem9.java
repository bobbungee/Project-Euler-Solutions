package id9;

public class Problem9 {
	
	private int goal;
	
	public Problem9(int number) {
		this.goal = number;
	}
	
	// Euclid's formula
	public int[] triplets() {

		for (int a = 0; a < goal; a++) {
			
	        for (int b = a + 1; b < goal; b++) {
	            for (int c = b + 1; c < goal; c++) {
	                if (a + b + c == goal && (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))) {
	                    return new int[] {a, b, c};
	                }
	            }
	        }
	        
	    }
		
		return new int[] {};
	}
	
	public int product(int[] trips) {
		int product = 1;
		for (int i : trips) {
			product = (product * i);
		}
		
		return product;
	}
	
}
