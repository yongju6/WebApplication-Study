package chapter12;

// 3차원의 한 점을 표현하기 위한 클래스
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	
	// this와 마찬가지로 super 붙이지 않고 메서드를 호출
	
	@Override	// annotation ==> 컴퓨터가 참고하는 주석
	public String getLocation() {
		
		return super.getLocation() + ", z : " + z;
	}
	
	// 오버라이딩 : 부모클래스에 선언된 메서드를 자식 클레스에서 선언하여 수정하여 쓰는 것
	
	
}
