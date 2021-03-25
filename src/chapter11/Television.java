package chapter11;

public class Television {
	int size;
	int length;
	int height;
	String color;
	int volum;
	int channel;
	boolean power;
	
	void power() {
		power =!power;
		
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
		
	void channelUp() {
		channel++;
		showChannel();
	}
	
	void channelDown() {
		channel--;
		showChannel();
	}
	
	void showChannel() {
		System.out.println("현재 채널은 "+ channel + "입니다.");
	}
	
	void volumUp() {
		volum++;
		showVolum();
	}
	
	void volumDown() {
		volum--;
		showVolum();
	}
	
	void showVolum() {
		System.out.println("현재 볼륨은 " + volum + "입니다");
	}
}
