package chapter10;

public class Method_Ex04 {
	void simple (int val) {
		System.out.println(val);
	}
	
	void simple2() {
		System.out.println("Hello World");
	}
	
	void simple3(String message) {
		System.out.println(message);
	}
	
	// simple4 메서드는 정수 두 개가 필요한 메서드
	void simple4(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	// simple5 메서든느 정수 두개와 문자 하나가 필요한 메서드
	void simple5(int num1, int num2, char c) {
		if( c == '+') {
			System.out.println(num1 + num2);
		}else if (c == '-') {
			System.out.println(num1 - num2);
		}
	}
	public static void main(String[] args) {
		Method_Ex04 ex4 = new Method_Ex04();
		
		ex4.simple(1);
		ex4.simple2();
		ex4.simple3("Hello World");
		
		ex4.simple5(4, 8, '+');
	}

}
