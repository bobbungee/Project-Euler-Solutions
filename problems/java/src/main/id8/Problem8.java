package id8;

public class Problem8 {
	
	private String numbers;
	
	public Problem8(String numbers) {
		this.numbers = numbers;
	}
	
	public int topFive() {
		int max = 0;
		
		for (int i = 0; i < numbers.length(); i++) {
			int product = fiveSum(i);
			if (product > max)
				max = product;
		}
		
		return max;
	}
	
	private int fiveSum(int pos) {
		if (pos+5 > numbers.length())
			return -1;
		
		char[] five = numbers.substring(pos, pos+5).toCharArray();
		int product = 1;
		
		// 1*2*3*4*5 = 120
		for (char c : five) {
			int calced = Integer.parseInt(c+"");
			product = product*calced;
		}
		
		return product;
	}

}
