
public class AnalogClock implements Observer {
	ClockTimer clockTimer;

	public AnalogClock(ClockTimer clockTimer) {
		this.clockTimer = clockTimer;
		
		clockTimer.subscribe(this);
	}
	
	public void update(Subject subject) {
		//React only if the topic is the topic of interest
		if (subject == clockTimer) {
			draw();
		}
	}
	
	//Retrieves information from the subject - pull model
	void draw() {
		System.out.println(String.format("ss:mm:hh - %d:%d:%d", 
										 clockTimer.getSecond(),
										 clockTimer.getMinute(),
										 clockTimer.getHour()));
	}
}
