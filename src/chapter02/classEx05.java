package chapter02;

public class classEx05 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.kor = 56;
		student1.eng = 41;
		student1.math = 88;
		student1.sum = student1.kor + student1.eng + student1.math;
		student1.avg = student1.sum / (double)Student.AMOUNT_OF_SUBJECT;
		
		System.out.println("Ã¶¼öÀÇ ÃÑ Á¡ = " + student1.sum);
		System.out.println("Ã¶¼öÀÇ Æò±Õ = " + student1.avg);
		
	} // end main

}
