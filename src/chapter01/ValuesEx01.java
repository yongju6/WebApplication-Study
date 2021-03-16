package chapter01;

public class ValuesEx01 {

	public static void main(String[] args) {
		// 출력 대상을 출력하는 기능
		// 출력 대상은 값만 가능하다.
//		System.out.println();
//		
//		char value = 'A';
//		System.out.println(value);
//		
//		int number = 10;
//		System.out.println(number);
//		
//		double data = -17.1;
//		System.out.println(data);
//		
//		boolean val1 = true;
//		System.out.println(val1);
		
		double num1 = 3.14;
		char num2 = 'Z';
		boolean num3 = false;
		int num4 = 100;
		
		// 변수명은 영문자, 숫자, 특수문자($, _)만 사용할 수 있다.
		// 변수명은 한글도 되긴는 하지만 권장하지는 않음
		int word;
		int word1;
		int word$;
		int word_;
		
		// 변수명의 시작은 영문자, 특수문자만 가능하다.
		int $word;
		int _word;
		
		// 변수명은 영문 대소문자를 구분한다.
		int apple = 17;
		int Apple = 27;
		
		// 변수명은 키워드를 사용할 수 없다.
		// 키워드 - 영단어이기는 하지만 자바가 미리 선점한 영단어
		
		// 변수는 중복해서 선언할 수 없다.
		
		
		// 카멜 표기법(낙타 표기법)
		int myAge;
		char myGrade;
		double point;
		
		int data = 127;
		long data2 = -129;
		long data3 = 32768;
		int num = 704;
		int temp = num;
		temp = 59;
		
		System.out.println(temp);
		
		double fnum = 70.4;
		float floatnum = 1.2345f;
		double d_value = 3.14;
		d_value = 7.81;
		
		char monja1 = 'a';
		System.out.println(monja1);
		
		char monja2 = 65;
		System.out.println(monja2);
		
		
		String strVal1 = "ABCDEFG";
		String strVal2 = "안녕하세요";
		
		System.out.println(strVal1);
		System.out.println(strVal2);
	}

}
