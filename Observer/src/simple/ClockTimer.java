package simple;

public class ClockTimer extends Subject {
	int hour = 0, minute = 0, second = 0;
	
	int getHour() {
		return hour;
	}
	
	int getMinute() {
		return minute;
	}
	
	int getSecond() {
		return second;
	}
	
	void updateSecond() {
		second = (second + 1) % 60;
	}
	
	void updateMinute() {
		minute = second == 0 ? (minute + 1) % 60 : minute;
	}
	
	void updateHour() {
		hour = minute == 0 & second == 0 ? (hour + 1) % 60 : hour;
	}
	
	void tick() {
		updateSecond();
		updateMinute();
		updateHour();		
		
		notifyObservers();
	}
}
