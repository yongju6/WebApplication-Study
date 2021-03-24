package chapter10;

public class Method_Ex10 {
	
	double div() {
		int result = 36%5;
		return result;
	} // end div method
	
	int stackAdd() {
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		return sum;
	} // end stackAdd method

	public static void main(String[] args) {
		Method_Ex10 ex10 = new Method_Ex10();
		
		double divRemain = ex10.div();
		int sum = ex10.stackAdd();
		
		System.out.println(divRemain);
		System.out.println(sum);
	}

}
