package chapter2;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		String[] date = new String[] {"3월 2일", "3월 3일", "3월 4일", "3월 5일", "3월 6일"};
		int[] money = new int[] {32159, 25157, 87982, 40839, 18908};
		char[] grade = new char[] {'B', 'A', 'D', 'B', 'A'};
		double[] dailyAvg = new double[] {40315.67, 11991.39, 26433.7};
		String[] month = new String[] {"3월", "4월", "5월"};
		
		System.out.println(Arrays.toString(date));
		System.out.println(Arrays.toString(money));
		System.out.println(Arrays.toString(date));
		System.out.println(Arrays.toString(grade));
		System.out.println(Arrays.toString(month));
		System.out.println(Arrays.toString(dailyAvg));
	}

}
