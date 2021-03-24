package chapter03;

import java.util.Scanner;

public class For_Ex18 {

	public static void main(String[] args) {
		// factorial -> 순차 곱셈
		
		Scanner scanf = new Scanner(System.in);
		System.out.print("펙토리얼을 구할 수를 입력하세요 : ");
		int num = scanf.nextInt();
		int result = 1;
		
		for(int i = num; i>=1; i--) {
			result *= i;
		} // end for
		
		System.out.println(num + "! = " + result);
		
		int even = 0;
		int odd = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				even += i;
			}else {
				odd += i;
			} // end if
		} // end for
		
		System.out.println("Even Sum : " + even);
		System.out.println("Odd Sum : " + odd);
		
		scanf.close();
	} // end main

}
