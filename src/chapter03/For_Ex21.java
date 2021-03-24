package chapter03;

import java.util.Scanner;

public class For_Ex21 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String letters = scanf.nextLine();
		
		
		for(int i=0; i<letters.length(); i++) {
			char monja = letters.charAt(i);
			if(monja != ' ') {
				System.out.print(monja);
			} // end if
		} // end for
		
		
		scanf.close();
	} // end main

}
