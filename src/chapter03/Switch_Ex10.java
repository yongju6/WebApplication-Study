package chapter03;

import java.util.Scanner;

public class Switch_Ex10 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요.");
		
		int num1 = scanf.nextInt();
		num1 = num1 %2;
		
		switch(num1) {
			case 0 :System.out.println("짝수"); break;
			case 1 :System.out.println("홀수"); break;
		} // end switch
		
		System.out.print("2021 - 03 - ");
		
		int num2 = scanf.nextInt();
		num2 = num2 % 7;
		
		switch(num2) {
			case 0: System.out.println("일요일"); break;
			case 1:	System.out.println("월요일"); break;
			case 2:	System.out.println("화요일"); break;
			case 3:	System.out.println("수요일"); break;
			case 4:	System.out.println("목요일"); break;
			case 5:	System.out.println("금요일"); break;
			case 6:	System.out.println("토요일"); break;
		} // end switch
		
		scanf.close();
	} // end main

}
