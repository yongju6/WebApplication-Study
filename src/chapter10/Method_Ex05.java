package chapter10;

import java.util.Scanner;

public class Method_Ex05 {	
	void gugudan(int num) {
		// 2단 출력
		System.out.println("===========[ 2단 ]==========");
		for(int i=1; i<10; i++) {
			System.out.println("2 X " + i + " = " + 2*i);
		}
		
		System.out.println("===========[ " + num + "단 ]==========");
		
		// 원하는 단 출력
		for(int i=1; i<10; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
	}
	
	
	public static void main(String[] args) {
		Method_Ex05 ex5 = new Method_Ex05();
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("출력할 단을 입력하세요 : ");
		int num = scanf.nextInt();
		
		ex5.gugudan(num);
		
		scanf.close();
	}

}
