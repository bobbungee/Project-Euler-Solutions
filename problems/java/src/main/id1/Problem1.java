package id1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem1 {
	
	private int endpoint;
	private int[] numbers = {3, 5};
	
	public Problem1(int endpoint) {
		this.endpoint = endpoint;
	}
	
	public List<Integer> multiples() {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i < endpoint; ++i) {
			if (i % numbers[0] == 0 || i % numbers[1] == 0)
				list.add(i);
		}
		
		return list;
	}
	
	public int sum(List<Integer> list) {
		int sum = 0;
		Iterator<Integer> i = list.iterator();
		
		while (i.hasNext())
			sum += i.next();
		
		return sum;
	}

}
