package chapter12;

public class Ex05 {

	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		System.out.println(fe1 instanceof FireEngine);
		System.out.println(fe1 instanceof Car);
		System.out.println(fe1 instanceof Object);
		
		Car car1 = new Car();
		System.out.println(car1 instanceof FireEngine);
		System.out.println(car1 instanceof Car);
		System.out.println(car1 instanceof Object);
		
		// 업케스팅 / 형변환 연산자 생략 가능
		car = (Car)fe1;
		// 다운케스팅 / 형변환 연산자 생량 불가능
		fe2 = (FireEngine)car;
		
		fe1.water();
		fe2.water();
	}

}
