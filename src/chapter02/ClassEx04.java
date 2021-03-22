package chapter02;

public class ClassEx04 {

	public static void main(String[] args) {
		// 변수
		int num1 = 10;
		num1 = 20;
		
		// 상수 : 변하면 안되는 데이터가 있을 경우 사용
		// 기준이 되는 값
		// 원주율
		// 특정 시점에 우리나라 땅의 크기
		final int num2 = 10;
		
		num1 = num1 * num2;
		
		System.out.println(num1);
	}

}
