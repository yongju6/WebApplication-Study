package chapter02;

public class Array_ClassEx01 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "고영희";
		student1.address = "부산 광역시 부산진구 중앙대로";
		
		Student student2 = new Student();
		student2.name = "이철수";
		student2.address = "부산 광역시 남구 전포대로";
		
		Student[] studentList = new Student[5];
		
		studentList[0] = new Student();
		studentList[1] = student1;
		studentList[2] = new Student();
		studentList[3] = student2;
		studentList[4] = new Student();
		
		System.out.println(studentList[3].address);
		
		studentList[0].name = "이철수";
		studentList[3].address = "부산광역시 부산진구 범천동";
//		student2.address = "부산광역시 부산진구 범천동";
		
		System.out.println(studentList[3].address);
	}

}
