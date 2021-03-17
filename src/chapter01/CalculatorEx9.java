package chapter01;

import java.util.Scanner;

public class CalculatorEx9 {

	public static void main(String[] args) {
//		int num1 = true ? 1 : 2;
//		int num2 = false ? 1 : 2;
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
//		boolean button = true;
//		
//		String status = button ? "불이 켜졌습니다." : "불이 꺼졌습니다.";
//		
//		System.out.println(status);
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = scanf.nextInt();
		boolean right = (kor>=0)&&(kor<=100);
		
		String status = right ? "올바른 점수 입니다." : "점수가 잘못되었습니다.";
		String pass = (kor>=50)&&right ? "Pass" : "Fail";
		
		System.out.println("입력한 국어 점수 : " + kor);
		System.out.println(status);
		System.out.println("패스 여부 : " + pass);
		
		scanf.close();
	}

}
