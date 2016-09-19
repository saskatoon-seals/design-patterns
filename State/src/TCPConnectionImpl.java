//Context (defines interface to clients)

//It delegates all state-specific requests to its TCPState instance
public class TCPConnectionImpl implements TCPConnection {
	
	private TCPState state;

	public void activeOpen() {
		state.activeOpen(this);
	}
	
	public void passiveOpen() {
		state.passiveOpen(this);
	}
	
	public void close() {
		state.close(this);
	}
	
	public void send() {
		state.send(this);
	}
	
	public void acknowledge() {
		state.acknowledge(this);
	}
	
	public void synchronize() {
		state.synchronize(this);
	}
	
	public void changeState(TCPState state) {
		this.state = state;
	}
	
	public void processOctetStream(TCPOctetStream stream) {
		//@TODO
	}
}
