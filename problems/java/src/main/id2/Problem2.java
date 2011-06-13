package id2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem2 {
	
	private int exceed;
	
	public Problem2(int exceed) {
		this.exceed = exceed;
	}
	
	public List<Integer> fibonacci() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		for (int i = 1; (list.get(i-1)+list.get(i)) <= exceed; ++i) {
			list.add(list.get(i-1)+list.get(i));
		}
		
		return list;
	}
	
	public int sum(List<Integer> fibonacci) {
		Iterator<Integer> i = fibonacci.iterator();
		int sum = 0;
		
		while (i.hasNext()) {
			int num = i.next();
			if (num % 2 == 0)
				sum += num;
		}
		
		return sum;
	}

}
