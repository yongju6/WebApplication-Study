package chapter03;

import java.util.Scanner;

public class If_else_Ex05 {
	static final int week = 7;
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.print("2021 - 03 - ");
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayOfMonth % If_else_Ex05.week;
		
		System.out.print("2020 - 03 - " + dayOfMonth + " ");
		
		if(dayOfWeek == 1) System.out.println("월요일");
		else if(dayOfWeek == 2) System.out.println("화요일");
		else if(dayOfWeek == 3) System.out.println("수요일");
		else if(dayOfWeek == 4) System.out.println("목요일");
		else if(dayOfWeek == 5)	System.out.println("금요일");
		else if(dayOfWeek == 6) System.out.println("토요일");
		else	System.out.println("일요일");
		
		
		scanf.close();
	} // end main

}
