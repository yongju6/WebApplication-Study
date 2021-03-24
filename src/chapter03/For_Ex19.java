package chapter03;

import java.util.Scanner;

public class For_Ex19 {

	public static void main(String[] args) {
		// 아래와 같이 줄 수를 입력 받아 별(*)을 출력하세요
		/*
		 *  줄 수 : (입력)
		 */
		
		Scanner scanf = new Scanner(System.in);
		System.out.print("줄 수를 입력하세요 : " );
		int num = scanf.nextInt();
		
//		for(int i=1; i<=num; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			} // end for j
//			
//			System.out.println();
//		} // end for i
		
		for(int i=num; i>=1; i--) {
			for(int k=1; k<=num-i; k++) {
				System.out.print(" ");
			}
			for(int j = i; j>=1; j--) {
				System.out.print("*");
			} // end for j
			System.out.println();
		} // end for i
		
		scanf.close();
	} // end main

}
