package chapter13;

public class TourGuide {
	// 여행을 위한 지식
	private Providable tour;
	
	public TourGuide(String location) {
		if(location.equals("Korean")) {
			tour = new KoreaTour();
		}else if(location.equals("Japan")) {
			tour = new JapanTour();
		}
	}
	
	public void doLeisureSports() {
		tour.leisurSports();
	}
	
	public void doSightSeeing() {
		tour.sightSeeing();
	}
	
	public void eatFood() {
		tour.food();
	}
}
