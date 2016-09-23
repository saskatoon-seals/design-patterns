package simplecase;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements Element {
	
	private static final int VALUE = 3;

	private List<Element> elements = new ArrayList<>();
	
	@Override
	public void accept(Visitor visitor) {
		elements.forEach(element -> element.accept(visitor));
		
		visitor.visitCompositeElement(this);
	}
	
	@Override
	public int getValue() {
		return VALUE;
	}
	
	public void add(Element element) {
		elements.add(element);
	}
}
