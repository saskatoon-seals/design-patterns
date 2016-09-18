
public class State {
	private int value;
	
	public State() {
		this(0);
	}
	
	public State(int value) {
		this.value = value;
	}
	
	void change() {
		value++;
	}
	
	int getValue() {
		return value;
	}
	
	State copy() {
		return new State(this.value);
	}
}
