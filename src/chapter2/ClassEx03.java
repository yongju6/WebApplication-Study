package chapter2;

public class ClassEx03 {

	public static void main(String[] args) {
		SimpleType01 type1 = new SimpleType01();
		type1.num1 = 10;
		SimpleType02 type2 = new SimpleType02();
		type2.instancMem1 = 20;
		
		System.out.println(type1.num1);
		System.out.println(type2.instancMem1);
	}

}
