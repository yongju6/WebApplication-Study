package chapter03;

import java.util.Scanner;

public class If_else_Ex06 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num = scanf.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanf.nextInt();
		
		
		
		if(num == num2) System.out.println("같은 수 입니다.");
		else if(num>num2) System.out.println("num값에 저장된 " + num + "이 num2(" + num2+")보다 큽니다.");
		else System.out.println("num2값에 저장된 " + num2 + "이 num(" + num+")보다 큽니다.");
		
		
		System.out.print("Enter your score : ");
		int grade = scanf.nextInt();
		
		if(grade<0||grade>100) {
			System.out.println("잘못 입력하였습니다.");
		}else {
			if(grade>=90) System.out.println("A");
			else if(grade>=80 && grade<=89) System.out.println("B");
			else if(grade>=70 && grade<=79) System.out.println("C");
			else if(grade>=60 && grade<=69) System.out.println("D");
			else System.out.println("F");
		}
		
		scanf.close();
	} // end main

}
