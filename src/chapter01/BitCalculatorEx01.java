package chapter01;

public class BitCalculatorEx01 {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 17;
		
		int num3 = num1 & num2;
		int num4 = num1 | num2;
		int num5 = num1 ^ num2;
		int num6 = num1 << 2;
		int num7 = num1 >> 2;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
	}

}
