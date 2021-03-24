package chapter10;

import java.util.Scanner;

public class Method_Ex11 {
	int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	} // end add method
	
	int div(int num1, int num2) {
		int remain = num1 % num2;
		return remain;
	} // end div method
	
	int stackAdd(int num) {
		if(num<0 || num >100) {
			System.out.println("n은 0이상 100이하만 가능합니다.");
			return -1;
		}
		
		int sum = 0; 
		for(int i=1; i<=num; i++) {
			sum += i;
		} // end for i
		return sum;
	} // end stackAdd method
	
	public static void main(String[] args) {
		Method_Ex11 ex11 = new Method_Ex11();
		Scanner scanf = new Scanner(System.in);
		
		int result = ex11.add(1, 2);
		System.out.println(result);
		
		System.out.println("Enter the first number");
		int num1 = scanf.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanf.nextInt();
		int remain = ex11.div(num1, num2);
		System.out.println("Remain : " + remain);
		
		System.out.println("Enter a number to get sum");
		int st = scanf.nextInt();
		int sum = ex11.stackAdd(st);
		System.out.println("1~" + st + " sum : " + sum);
		
		scanf.close();
	} // end main
}
