
public class MementoImpl implements MementoState, Memento {
	State state;
	
	public void setState(State state) {
		this.state = state.copy();
	}
	
	public State getState() {
		return state;
	}
	
	public void destroy() {
		//@TODO
	}
}
