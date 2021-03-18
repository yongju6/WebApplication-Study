package chapter2;

import java.util.Arrays;

public class ArrayEx07 {
	public static void main(String[] args) {
		int[] korArr = new int[4];
		korArr[0] = 84;
		korArr[1] = 93;
		korArr[2] = 52;
		korArr[3] = 42;
		
//		System.out.println(korArr[1]);
//		
//		korArr[1] = 75;
//		
//		System.out.println(korArr[1]);
		
		double[] avgArr = new double[] {67, 81.3, 54.67, 64.67};
		
		System.out.println(Arrays.toString(avgArr));
		
		avgArr[3] = avgArr[2];
		avgArr[2] = avgArr[1];
		avgArr[1] = avgArr[0];
		avgArr[0] = 78.99;
		
		System.out.println(Arrays.toString(avgArr));
		
		int[] numArr = new int[] {2, 4, 6, 8};
		
		int num = numArr[2];
		
		System.out.println(num);
		
		char[] charArr = new char[] {'Z', 'Y'};
		char cLetter = charArr[0];
		
		System.out.println(cLetter);
		
	}
}
