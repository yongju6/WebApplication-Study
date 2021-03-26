package chapter13;

// 추상 클래스는 다른 클래스의 부모 클래스가 될 수 있다.
// 부모 클래스가 추상 클래스라면 
// 자식 클래스는 부모 클래스에 정의되어 있는
// 추상 메서드를 반드시 구현해야 한다.
public abstract class AudioPlayer extends Player{
	
	// 부모 클래스에 정의되어 있는 메서드를 자식 클래스에서 재정의하는 것 : 오버라이딩

	@Override
	public void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
