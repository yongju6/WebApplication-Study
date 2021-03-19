package chapter2;

public class Calculator_ApplicationEx02 {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		double pi_1 = pi * 1000;
		int pi_2 = (int)pi_1;
		double pi_3 = pi_2 / 1000.0;
		System.out.println(pi_3);
		
		double pi_4 = pi * 100;
		double pi_5 = pi_4 + 0.5;
		int pi_6 = (int) pi_5;
		double pi_7 = pi_6 / 100.0;
		System.out.println(pi_7);
	}

}
