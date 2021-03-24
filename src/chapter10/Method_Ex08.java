package chapter10;

public class Method_Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Ex08 ex8 = new Method_Ex08();
		
		SimpleType01 type = new SimpleType01();
		type.num1 = 10;
		
		System.out.println("before : " + type.num1);
		ex8.change(type);
		System.out.println("after : " + type.num1);
		
		int[] arr = {1,2,3};
		
		System.out.println("before : " + arr[0]);	
		ex8.change(arr[0]);
		System.out.println("after : " + arr[0]);
		
		System.out.println("before : " + arr[0]);
		ex8.change(arr);
		System.out.println("after : " + arr[0]);
		
		
	} // end main
	
	void change(SimpleType01 type) {
		type.num1 = type.num1*10;
		System.out.println("change(SimpeType01) : " + type.num1);
	} // end change method with entity
	
	void change(int[] arr) {
		arr[0] = arr[0] * 10;
		
		System.out.println("change(int[]) : " + arr[0]);
	} // end change method with array
	
	void change(int num1) {
		num1 = num1*10;
		
		System.out.println("change(int) : " + num1);
	}
}
