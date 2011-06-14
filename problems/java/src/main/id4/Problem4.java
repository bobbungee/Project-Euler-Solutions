package id4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem4 {
	
	int digits;
	
	public Problem4(int digits) {
		this.digits = digits;
	}
	
	public int palindrome() {
		List<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < digits; i++)
			sb.append('9');
		
		int startX = Integer.parseInt(sb.toString());
		
		for (int i = startX; i > 0; --i) {
			for (int n = startX; n > 0; --n) {
				if (!isInDigit(n))
					break;
				
				if (isPalindrome(i*n))
					list.add(i*n);

			}
		}
		
		Iterator<Integer> i = list.iterator();
		int cmax = 0;
		while (i.hasNext()) {
			int next = i.next();
			if (next > cmax)
				cmax = next;
		}
		
		return cmax;
	}
	
	private boolean isPalindrome(int num) {
		String number = Integer.toString(num);
		
		for (int i = 0; i < number.length(); ++i) {
			if (number.charAt(i) != number.charAt((number.length()-i)-1))
				return false;
		}
		
		return true;
	}
	
	private boolean isInDigit(int num) {
		return Integer.toString(num).length() == digits;
	}

}
