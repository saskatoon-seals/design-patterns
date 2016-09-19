
public interface TCPConnection {
	void changeState(TCPState state);
	void processOctetStream(TCPOctetStream stream);
}
