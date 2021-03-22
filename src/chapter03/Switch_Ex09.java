package chapter03;

import java.util.Scanner;

public class Switch_Ex09 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int book = scanf.nextInt();
		if(book >=0) {
			book = book / 10;
			switch(book) {
				case 0: 
					System.out.println("조금 더 노력하세요!");
					break;
				case 1 : 
					System.out.println("책 읽는 것을 즐기시는 분이시네요!");
					break;
				case 2:
					System.out.println("책을 사랑하시는 군요!");
					break;
				default:
					System.out.println("다독왕입니다!");
					break;
			} // end switch
		} else {
			System.out.println("잘못 입력하였습니다.");
		} // end if
		
		scanf.close();
		
	} // end main

}
