package chapter10;

public class Method_Ex07 {
	
	public static void main(String[] args) {
		int num1 = 10;
		
		Method_Ex07 ex7 = new Method_Ex07();
		
		System.out.println("before : " + num1);
		ex7.change(num1);
		System.out.println("after : " + num1);
		System.out.println();
		
		SimpleType01 type = new SimpleType01();
		type.num1 = 10;
		
		System.out.println("before : " + type.num1);
		ex7.change(type);
		System.out.println("after : " + type.num1);
		
	} // end main
	
	void change(int num1) {
		num1 = num1 * 10;
		
		System.out.println("change(num1) : " + num1);
	} // end change method
	
	void change(SimpleType01 type) {
		type.num1 = type.num1*10;
		System.out.println("change(SimpeType01) : " + type.num1);
	} // end change method with entity
} // end class
