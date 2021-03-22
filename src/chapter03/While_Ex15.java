package chapter03;

import java.util.Scanner;

public class While_Ex15 {

	public static void main(String[] args) {
		// while 문은 주로 조건 반복문(끝이 명확하지 않은)에 적합
		
		Scanner scanf = new Scanner(System.in);
		char repeat = 'y';
		
		while(true) {
			
			int track = 1;
			System.out.println("Play music");
			while(track<=10) {
				System.out.println("Track " + track);
				track++;
			} // end inner while
			
			System.out.println("처음부터 다시 재생하시겠습니까?(y : yes , n : no)");
			repeat = scanf.next().charAt(0);
			if(repeat !='y') {
				break;
			}
		}
		
		scanf.close();
	}

}
