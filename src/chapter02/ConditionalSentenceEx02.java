package chapter02;

import java.util.Scanner;

public class ConditionalSentenceEx02 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 : ");
		double height = scanf.nextDouble();
		
		System.out.println("몸무게를 입력하세요 : ");
		double weight = scanf.nextDouble();
		
		double bmi = weight / (height*height)*10000;
		
		System.out.println("BMI지수는 : " + bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}
		if((bmi>=18.5)&&(bmi<23)) {
			System.out.println("정상");
		}
		if((bmi>=23)&&(bmi<25)) {
			System.out.println("과체중 의심");
		}
		if((bmi>=25)&&(bmi<30)) {
			System.out.println("비만");
		}
		if(bmi>=30) {
			System.out.println("고도비만");
		}
		
		scanf.close();
				
		
	} // end main

}
