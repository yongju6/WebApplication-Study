package chapter2;

public class Calculator_ApplicationEx01 {

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		
		numbers.num1 = 1_000_000;
		numbers.num2 = numbers.num1;
		
		int var = numbers.num1 * numbers.num2;
		System.out.println(var);
	}

}
