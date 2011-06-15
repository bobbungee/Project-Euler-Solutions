package id10;

public class ExecuteProblem10 {
	
	public static void main(String args[]) {
		Problem10 pro = new Problem10(2000000);
		System.out.println(pro.sum(pro.listPrimes()));
	}

}
