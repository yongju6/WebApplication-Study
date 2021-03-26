package chapter13;

public class Ex01 {

	public static void main(String[] args) {
		// 부모 클래스에 정의되어 있는 메서드를
		// 자식 클래스 마다 서로 다르게 구현해야 할 때
		// 추상 클래스가 유용하게 사용됨
		Lion lion = new Lion();
		Person person = new Person();
		
		lion.run();
		lion.eat();
		System.out.println("========================");		
		person.run();
		person.eat();
	}

}
