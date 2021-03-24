package chapter10;

// Ex1 클래스는 메서드를 만들고
// 만든 메서드를 실행할 클래스
// 메서드를 만든다 -> 메서드를 정의한다 / 선언한다

public class Ex01 {
	void helloWorld() {
		System.out.println("Hello World~!");
	}
	
	public static void main(String[] args) {
		Ex01 ex1 = new Ex01();
		// simple1 메서드 호출
		ex1.helloWorld();
		
		Ex02 ex2 = new Ex02();
		ex2.programStartMessage();
		ex2.onePlusOne();
		
		Method_Ex03 ex3= new Method_Ex03();
		ex3.foundationDay();
	}

}
