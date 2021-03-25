package chapter11;

import java.util.Scanner;
// static import -> 클래스의 클래스 멤버들을 크래스 명 없이 사용할 수 있도록 해주는 구문
import static chapter11.SimpleType.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		SimpleType type = new SimpleType();
		System.out.println("============ ============");
		
		//System.out.println(SimpleType.num1);
		
		hello();
		
		scanf.close();
	}

}
