package chapter11;

public class Ex02 {

	public static void main(String[] args) {
		Ex01 obj = new Ex01();
		
		obj.num1 = 1;
		obj.num2 = 3.14;
		obj.num3 = 'a';
		obj.num4 = "Hello";
		
		obj.func1();
		obj.func2();
		obj.func3();
		obj.func4();
		
		System.out.println("=====================");
		Ex01 obj2 = new Ex01();
		
		obj2.num1 = 1;
		obj2.num2 = 3.14;
		obj2.num3 = 'a';
		obj2.num4 = "Hello";
		
		obj2.func1();
		obj2.func2();
		obj2.func3();
		obj2.func4();
		
	}

}
