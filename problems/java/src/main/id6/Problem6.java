package id6;

public class Problem6 {
	
	private int times;
	
	public Problem6(int times) {
		this.times = times;
	}
	
	public int sumOfSquare() {
		int sum = 0;
		
		for (int i = 1; i <= times; ++i) {
			sum += Math.pow(i, 2);
		}
		
		return sum;
	}
	
	public int squareOfSums() {
		int sum = 0;
		
		for (int i = 1; i <= times; ++i) {
			sum += i;
		}
		
		return (int) Math.pow(sum, 2);
	}
	
	public int difference(int a, int b) {
		return a - b;
	}

}
