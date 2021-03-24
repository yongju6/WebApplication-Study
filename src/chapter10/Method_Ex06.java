package chapter10;

import java.util.Scanner;

public class Method_Ex06 {
	void simple1() {
		System.out.println("10 + 20 = " + (10 + 20));
	} // end simple method
	
	void sum(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	} // end sum method
	
	void max(int num1, int num2) {
		if(num1>num2) {
			System.out.println("더 큰 수 : " + num1);
		} else if(num1 == num2) {
			System.out.println("두 수는 같습니다.");
		} else {
			System.out.println("더 큰 수 : " + num2);
		}
	} // end max method
	
	void simMax() {
			
		if(11>10) {
			System.out.println("11은 10보다 큽니다.");
		}
	} // end simMax method
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		Method_Ex06 ex6 = new Method_Ex06();
		
		ex6.simple1();
		
		System.out.println("Enter the first number");
		int num1 = scanf.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanf.nextInt();
		
		ex6.sum(num1, num2);
		ex6.max(num1, num2);
		ex6.simMax();
		
		scanf.close();
	} // end main

}
