package simplecase;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstVisitorTest {

	@Test
	public void vistitsAllElements() {
		CompositeElement compositeElement = new CompositeElement();		
		Visitor visitor = new FirstVisitor();		
		compositeElement.add(new ElementA());
		compositeElement.add(new ElementB());
		
		compositeElement.accept(visitor);
		
		assertEquals(6, visitor.getCount());
	}
}
