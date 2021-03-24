package chapter03;

public class For_Ex20 {

	public static void main(String[] args) {
		String number = "0123456789";
		System.out.println(number.length());
		
//		for(int i=0; i<number.length(); i++) {
//			System.out.println(number.charAt(i));
//		} // end for i number
		
		String a = "¾È³çÇÏ¼¼¿ä";
//		System.out.println(a.length());
		
		for(int i=0; i<a.length(); i++) {
			
			char monja = a.charAt(i);
			
			if(monja == 'a') {
				
			}
			System.out.println(a.charAt(i));
		} // end for i a
		
		
		
	} // end main
}
