package chapter2;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[][] student = {
				{84, 62, 55},
				{93, 71, 80},
				{52, 79, 33},
				{42, 100, 52}
		};
		
		int kor1 = student[0][0];
		// 이차원 배열의 행 번호만 사용했을 때 일차원 배열을 사용하여 행만 저장할 수 있음
		int[] korScore = student[0];
		
		System.out.println(Arrays.toString(korScore));
	}

}
