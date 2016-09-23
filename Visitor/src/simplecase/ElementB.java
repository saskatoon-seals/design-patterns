package simplecase;

public class ElementB implements Element {
	
	private static final int VALUE = 2;

	@Override
	public void accept(Visitor visitor) {
		visitor.visitElementB(this);
	}
	
	@Override
	public int getValue() {
		return VALUE;
	}
}
