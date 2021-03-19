package chapter03;

import java.util.Scanner;

public class If_else_Ex08 {
	static final String plus = "+";
	static final String minus = "-";
	static final String div = "/";
	static final String multiple = "*";

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = scanf.nextInt();
		
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = scanf.nextInt();
		
		System.out.print("연산자를 입력하세요 : ");
		String calculator = scanf.next();
		
		if(calculator.equals(If_else_Ex08.plus)) {
			System.out.println(num1 + " " + calculator + " " + num2 + " = " + (num1 + num2));
		}else if(calculator.equals(If_else_Ex08.minus)) {
			System.out.println(num1 + " " + calculator + " " + num2 + " = " + (num1 - num2));
		}else if(calculator.equals(If_else_Ex08.div)) {
			System.out.println(num1 + " " + calculator + " " + num2 + " = " + (num1 / (double)num2));
		}else if(calculator.equals(If_else_Ex08.multiple)) {
			System.out.println(num1 + " " + calculator + " " + num2 + " = " + (num1 * num2));
		}else {
			System.out.println("잘못입력하였습니다.");
		}// end if
		
		scanf.close();
	} // end main

}
