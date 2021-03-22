package chapter03;

public class While_Ex14 {

	public static void main(String[] args) {
		System.out.println("구구단");
		
		int num = 1;
		int std = 2;
		
		while(std<6) {
			num = 1;
			System.out.println("======[" + std + "단]=======");
			while(num<10) {
				System.out.println(std + " X " + num + " = " + (std*num));
				num++;
			} // end inner while
			std++;
			
		} // end while
		
	} // end main
}
