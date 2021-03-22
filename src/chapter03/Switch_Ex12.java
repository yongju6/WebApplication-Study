package chapter03;

import java.util.Scanner;

public class Switch_Ex12 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("코리아 IT 자판기");
		System.out.println("1~3. 콜라");
		System.out.println("4. 환타");
		System.out.println("5~6. 사이다");
		System.out.println("7. 마운틴듀");
		System.out.print("자판기 버튼을 누르세요 : ");
		
		int button = scanf.nextInt();
		
		switch(button) {
		case 1:
		case 2:
		case 3: System.out.println("콜라"); break;
		case 4: System.out.println("환타"); break;
		case 5:
		case 6: System.out.println("사이다"); break;
		case 7: System.out.println("마운틴 듀"); break;
		default: System.out.println("잘못 입력하였습니다.");
		}
		
		scanf.close();
	} // end main

}
