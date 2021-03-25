package test;

import chapter11.TV;

public class Ex01 {
	public static void main(String[] args) {
		TV LG_TV = new TV();
		LG_TV.setColor("red");
		
		// 객체지향 프로그래밍은 기능을 중심으로 프로그램을 개발하는 방법
		// 객체를 사용하는 쪽에서 객체가 제공하는 기능만을 사용해야 한다.
		
		// 전원을 켰을 때 채널 번호를 알려주고 싶을 때는? 
		// 1. 전원을 켜고
		LG_TV.power();
		
		// 2. 채널 번호를 알려준다. ( 채널 번호를 알려주는 매서드 )
		// getter
		System.out.println("채널 번호는 " + LG_TV.getChannel() + "번 입니다.");
		
		LG_TV.channelDown();
		LG_TV.channelUp();
		
		// 프로시져지향 프로그래밍 기법
//		LG_TV.channel++;
		
//		LG_TV.showChannel();
		
	}
}
