
public class Originator {
	State state;
	
	public Originator() {
		state = new State();
	}
	
	Memento createMemento() {
		MementoState mementoState = new MementoImpl();
		mementoState.setState(state);
		
		return (Memento) mementoState;
	}
	
	void setMemento(Memento memento) {
		this.state = ((MementoState) memento).getState();
	}
	
	void operation() {
		state.change();
	}
}
