package chapter03;

import java.util.Scanner;

public class If_else_Ex07 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String a = "+";
		// next 메서드 -> 사용자가 입력한 값을 문자열로 가져옴
		String b = scanf.next();
		
		if(a.equals(b)) {
			System.out.println("a와 b가 같습니다.");
		}else {
			System.out.println("a와 b가 다릅니다");
		}
		
		scanf.close();
	} // end main

}
