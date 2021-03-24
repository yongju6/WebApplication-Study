package chapter10;

public class Method_Ex12 {
	// 세 add 매서드는 이름은 같지만 매개변수가 다르므로
	// 오버로딩 된 메서드이다.
	
	// 정수 두개의 합을 구하는 메서드
	int add (int num1, int num2) {
		int add = num1 + num2;
		return add;
	} // end add
	
	// 실수 두개의 합을 구하는 메서드
	double add(double num1 , double num2) {
		double add = num1 + num2;
		return add;
	} // end add
	
	// 정수, 실수의 합을 구하는 메서드
	double add(int num1, double num2) {
		double add = num1 + num2;
		return add;
	} // end add
	
	int num1;
	
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("Instance Member Method");
	} // end instance Member Method
	
	static void classMemberMethod() {
		System.out.println("Class member method");
	} // end class member method
	
	public static void main(String[] args) {
		Method_Ex12 ex12 = new Method_Ex12();
		
		// 인스턴스를 사용하여 메서드 호출
		ex12.instanceMemberMethod(); 
		
		// 클래서 명을 사용하여 메서드 호출
		Method_Ex12.classMemberMethod();
	} // end main

}
