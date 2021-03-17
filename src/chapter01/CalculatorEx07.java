package chapter01;

import java.util.Scanner;

public class CalculatorEx07 {

	public static void main(String[] args) {
		/*
		 * 논리 연산자 : 논리값(true, false)를 연산하기 위한 연산자
		 * && : 두 값 모두 true일 때 결과가 true
		 * || : 두 값 중 하나만 true면 결과가 true
		 * ! : true를 false로, false를 true로 값을 반대로 만들어주는 연산자 
		 */
		
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
//		System.out.println(!true);
//		System.out.println(!false);
		
		
		// Scanner 기능 꾸러미 : 입력을 위한 여러가지 기능을 갖고 있음
		// 기능 꾸러미를 사용하려면 구체화르 시켜야 함
		Scanner scanf = new Scanner(System.in);
		// 객체가 제공하는 기능 -> 메서드
		// nextInt 메서드 : 입력한 값을 정수로 가져오는 기능
		System.out.print("KOR Score : ");
		int kor = scanf.nextInt();
		System.out.println("KOR : " + kor);
		boolean right = (kor >=0)&&(kor<=100);
		System.out.println(right);
	}

}
