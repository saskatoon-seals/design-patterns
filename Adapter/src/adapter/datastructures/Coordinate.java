package adapter.datastructures;

public class Coordinate {
	int value;
	static final int DEFAULT_VALUE = 0;
	
	public Coordinate() {
		this.value = DEFAULT_VALUE;
	}
	
	public Coordinate(int value) {
		this.value = value;
	}
	
	public Coordinate add(Coordinate x) {
		this.value += x.value;
		return this;
	}
	
	public static Coordinate add(Coordinate x, Coordinate y) {
		return new Coordinate(x.value + y.value);
	}
}
