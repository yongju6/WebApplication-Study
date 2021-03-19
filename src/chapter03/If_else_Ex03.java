package chapter03;

import java.util.Scanner;

public class If_else_Ex03 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = scanf.nextInt();
		if(num<0||num>100) {
			System.out.println("잘못된 값을 입력하였습니다.");
		} // end if
		
		if(num>=50) {
			System.out.println("50이상의 값이 들어있습니다.");
		}else {
			System.out.println("50미만의 값이 들어있습니다.");
		} // end if
		
		System.out.print("키를 입력하세요 : ");
		double height = scanf.nextDouble();
		if(height>150) {
			System.out.println("탑승 가능");
		}else {
			System.out.println("탑승 불가");
		}
		
		scanf.close();
	} // end main

}
