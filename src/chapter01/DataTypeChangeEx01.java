package chapter01;

public class DataTypeChangeEx01 {

	public static void main(String[] args) {
		int num1 = 20;
		double num2 = 17.32149;
		
		System.out.println((double)num1);
		System.out.println((int)num2);
		
		double num3 = (double) num1;
		int num4 = (int) num2;
		
		System.out.println(num3);
		System.out.println(num4);
	}

}
