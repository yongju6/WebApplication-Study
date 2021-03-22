package chapter03;

import java.util.Scanner;

public class While_Ex16 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		char repeat = 'y';
		
		while(true) {
			
			int track = 1;
			
			System.out.println("Play music");
			
			while(track<=10) {
				System.out.println("Track " + track);
		
				System.out.println("처음부터 다시 재생할까요?(y : Yes, n : No)");
				repeat = scanf.next().charAt(0);
				
				if(repeat == 'y') {
					track = 1;
					System.out.println("다시 처음부터 재생");
					continue;
				} // end if
				
				track++;
				
			} // end inner while
			scanf.close();
		} // end while
		
		
	} // end main

}
