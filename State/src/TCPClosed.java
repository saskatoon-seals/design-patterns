
public class TCPClosed extends TCPState {
	
	static TCPClosed instance = new TCPClosed();
	
	void activeOpen(TCPConnection connection) {
		//@TODO: send SYN, receive SYN, ACK,..
		
		passiveOpen(connection);
	}
	
	void passiveOpen(TCPConnection connection) {
		changeState(connection, instance);
	}
}
