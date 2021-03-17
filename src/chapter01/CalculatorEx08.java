package chapter01;

import java.util.Scanner;

public class CalculatorEx08 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Eye Sights : ");
		
		// 시력은 0.0 ~ 2.0까지
		// sight 변수에 시력을 저장하고 시력이 0.0 ~ 2.0 사이인지 확인
		
		double sight = scanf.nextDouble();
		
		boolean right = (sight>=0.0) && (sight<=2.0);
		
		boolean result1 = sight <0.0;
		boolean result2 = sight > 2.0;
		
		boolean result = !(result1||result2);
		if(result) {
			System.out.println("시력 : " + sight);
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

}
