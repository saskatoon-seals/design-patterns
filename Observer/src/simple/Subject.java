package simple;
import java.util.LinkedList;

public class Subject {
	LinkedList<Observer> observers = new LinkedList<>();	
	
	void subscribe(Observer observer) {
		observers.add(observer);
	}
	
	void unsubscribe(Observer observer) {
		observers.remove(observer);
	}
	
	void notifyObservers() {
		observers.stream().forEach(observer -> observer.update(this));
	}
}
