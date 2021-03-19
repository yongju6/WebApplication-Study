package chapter03;

import java.util.Scanner;

public class If_else_Ex04 {
	static final int nowYear = 2021;

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("Enter a year when you born");
		
		int year= scanf.nextInt();
		
		int age = If_else_Ex04.nowYear-year +1;
		System.out.println("Your age is " + age);
		
		if(age>=1 && age<=7) {
			System.out.println("미취학 유아동입니다.");
		}else if(age>=8 && age<=13) {
			System.out.println("초등학생입니다.");
		}else if(age>=14 && age<=16) {
			System.out.println("중학생입니다.");
		}else if(age>=17 && age<=19) {
			System.out.println("고등학생입니다.");
		}else if(age>=20) {
			System.out.println("성인입니다.");
		} // end if
		
		scanf.close();
		
	} // end main

}
