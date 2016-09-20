
public abstract class TCPState {
	void transmit(TCPConnection connection, TCPOctetStream stream) {
		
	}
	
	void activeOpen(TCPConnection connection) {
		
	}
	
	void passiveOpen(TCPConnection connection) {
		
	}
	
	void close(TCPConnection connection) {
		
	}
	
	void synchronize(TCPConnection connection) {
		
	}
	
	void acknowledge(TCPConnection connection) {
		
	}
	
	void send(TCPConnection connectin) {
		
	}
	
	protected void changeState(TCPConnection connection, TCPState state) {
		connection.changeState(state);
	}
}
