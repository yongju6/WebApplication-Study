package chapter01;

public class DataTypeChangeEx03 {

	public static void main(String[] args) {
//		char monja = 'A';
//		int num= 20;
//		
//		// 문자를 정수로 변환(업캐스팅) ==> 형변환 연산자 생략
//		int num2 = monja;
//		
//		//정수를 실수로 변환(업캐스팅)
//		float fNum2 = num;
		
		// 실수 -> 정수로 형 변환
		// 다운캐스팅
		// 값 변경 있음
		double a = 1.1414;
		int b = (int)a;
		
		// 정수 -> 실수로 형변환
		// 업캐스팅
		// 값 변경 없음
		int c = 1;
		double d = (double) c;
		
		// 문자 -> 정수로 형 변환
		// 업캐스팅
		// 값 변경 없음
		char e ='A';
		int f = e;
		
		// 정수 -> 문자로 형 변환
		// 다운 캐스팅
		// 값 변경 없음
		int g = 100;
		char h = (char)g;
		
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		System.out.println(h);
		
	}

}
