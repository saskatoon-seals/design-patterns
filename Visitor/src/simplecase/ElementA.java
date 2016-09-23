package simplecase;

public class ElementA implements Element {

	private static final int VALUE = 1;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitElementA(this);
	}
	
	@Override
	public int getValue() {
		return VALUE;
	}
}
