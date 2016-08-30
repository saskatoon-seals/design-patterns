
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockTimer clockTimer = new ClockTimer();
		
		DigitalClock digitalClock = new DigitalClock(clockTimer);
		AnalogClock analogClock = new AnalogClock(clockTimer);
		
		//Generate the event (should come from internal clock interrupts)
		clockTimer.tick();
		clockTimer.tick();
		clockTimer.tick();
	}

}
