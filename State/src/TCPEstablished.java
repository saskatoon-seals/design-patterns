//Singleton
public class TCPEstablished extends TCPState {
	
	public static TCPState instance = new TCPEstablished();
	
	private TCPEstablished() {
		
	}
	
	public void close(TCPConnection connection) {
		//@TODO: send FIN, receive ACK of FIN
		
		this.changeState(connection, this /*(==instance*/);
	}
	
	public void transmit(TCPConnection connection, TCPOctetStream stream) {
		connection.processOctetStream(stream);
	}
}
