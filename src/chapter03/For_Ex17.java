package chapter03;

public class For_Ex17 {

	public static void main(String[] args) {
		// 초기식 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		// 실행 순서 : 초기식 -> 조건식 -> 증감식 -> 조건식 -> 증감식 -> 조건식 -> ...
//		for(int i=0; i<=10; i++) {
//			System.out.println(i);
//		}
		
		// Odd Sum with only for
		int sum = 0;
		for(int i=1; i<11; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		
		// Odd Sum with for&if
		for(int j=1; j<=10; j++) {
			int su = j%2;
			if(su==1) sum+=j;
		} // end for j
		
		System.out.println(sum);
		
		int evenSum = 0;
		
		//Even Sum with only for
		for(int i=0; i<=10; i+=2) {
			evenSum += i;
		} // end for
		
		System.out.println(evenSum);
		
		evenSum = 0;
		
		//Even sum with for&if
		for(int j=0; j<=10; j++) {
			int re = j%2;
			if(re == 0) evenSum+=j;
		} // end for j
		
		System.out.println(evenSum);
		
	} // end main

}
