
public class Singleton {
	private int value;	
	private static Singleton singleton;
	private static final int DEFAULT_VALUE = 1;
	
	private Singleton(int value) {
		this.value = value;
	}
	
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton(DEFAULT_VALUE);
		}
		return singleton;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
