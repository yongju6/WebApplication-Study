package chapter03;

import java.util.Scanner;

public class Switch_Ex11 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("First number");
		int num1 = scanf.nextInt();
		
		System.out.println("Second number");
		int num2 = scanf.nextInt();
		
		System.out.println("Operator");
		String operator = scanf.next();
		
		switch(operator) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + (num1 / (double)num2));
			break;
		} // end switch
		
		scanf.close();
	} // end main

}
