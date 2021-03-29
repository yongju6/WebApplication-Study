package chapter13;

public class Ex03 {
	public static void main(String[] args) {
		// 여행 가이드
		TourGuide tourGuide = new TourGuide("Korean");
		
		tourGuide.doLeisureSports();
		tourGuide.doSightSeeing();
		tourGuide.eatFood();
		
		tourGuide = new TourGuide("Japan");
		tourGuide.doLeisureSports();
		tourGuide.doSightSeeing();
		tourGuide.eatFood();
	} // end main
}
