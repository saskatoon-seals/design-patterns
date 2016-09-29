package simple;

public class DigitalClock implements Observer {
	ClockTimer clockTimer;
	
	public DigitalClock(ClockTimer clockTimer) {
		this.clockTimer = clockTimer;
		
		clockTimer.subscribe(this);
	}
	
	public void update(Subject subject) {
		//React only if the topic is the topic of interest
		if (subject == clockTimer) {
			draw();
		}
	}
	
	void draw() {
		System.out.println(String.format("hh:mm:ss - %d:%d:%d", 
										 clockTimer.getHour(),
										 clockTimer.getMinute(),
										 clockTimer.getSecond()));
	}
}
