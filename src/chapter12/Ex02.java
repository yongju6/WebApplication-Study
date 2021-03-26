package chapter12;

public class Ex02 {

	public static void main(String[] args) {
		Parent02 parent = new Parent02();
		
		System.out.println(parent.num);
		
		parent.setNum(10);
		System.out.println(parent.num);
		
		System.out.println("===== ===== ===== =====");
		Child02 child = new Child02();
		
		System.out.println(child.num);
		
	}

}
