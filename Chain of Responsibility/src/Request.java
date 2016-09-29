
public class Request {
	private String description;
	private int value;
	
	public Request(String description, int value) {
		this.description = description;
		this.value = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getValue() {
		return value;
	}
}
