package chapter11;

public class TV {
	// 외부로 공개하면 안되는 데이터를 감추는 것을 캡슐화, 정보은닉
	private String color;
	private boolean power;
	private int channel;
	private int volumn;
	private int hour;
	private int minute;
	private int second;
	
	
	
	public TV() {
		color = "검정";
		power = false;
		channel = 1;
	}
	
	public TV(boolean power) {
		this.power = power;
		System.out.println("매개변수 1개 생성자 호출");
	}
	
	public TV(int channel, int volumn) {
		this.channel = channel;
		this.volumn = volumn;
		System.out.println("매개변수 2개 생성자 호출");
	}
	
	public TV(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		System.out.println("매개변수 3개 생성자 호출");
	}
	
	// 객체지향은 데이터들을 갖고 있을 객체를 생각해야 하고
	// 객체가 제공하는 기능을 설계해야하므로
	// 프로젝트 개발 기간이 길어지는 단점이 있음
	// 프로젝트의 규모가 커지면 점점 복잡해짐
	// 프로젝트를 객체 지향적으로 제대로 설계를 해두면
	// 유지보수 속도가 굉장히 빨라짐
	
	// 프로시져지향은 데이터만 생각하면 되므로
	// 프로젝트 개발 기간이 상대적으로 짧은 장점이 있음
	// 프로젝트의 규모가 커지면 데이터가 거미줄처럼 얽혀서 사용되므로
	// 유지보수 속도가 굉장히 느려짐
	
	// setter -> private 접근 제어자인 멤버 변수에 원하는 값을 설정해야 할 때 필요한 메서드
	public void setColor(String color) {
		if(color.equals("red") || color.equals("blue")) {
			this.color = color;
		}else {
			System.out.println("컬러는 red, blue만 가능합니다.");
		}
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String getColor() {
		return color;
	}

	public int getVolumn() {
		return volumn;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	// 좋은 메서드 - 한번에 하나의 기능만 제공하는 메서드
	// 1. 전원을 켜고
	// 2. 현재 채널 번호를 알려줌
	public void power() {
		power = !power;
		if(power) {
			System.out.println("전원을 켰습니다.");
			showChannel();
		}else {
			System.out.println("전원을 껐습니다");
		}
	}
	
	public void channelUp() {
		channel ++;
		showChannel();
	}
	
	public void channelDown() {
		channel--;
		showChannel();
	}
	
	// channelUp / channeDown 메서드를 위한 메서드
	private void showChannel() {
		System.out.println("현재 채널 번호는 " +  channel + "번입니다.");
	}
}
