package simplecase;

public class FirstVisitor implements Visitor {

	int count = 0;
	
	@Override
	public void visitElementA(ElementA element) {
		count += element.getValue();		
	}

	@Override
	public void visitElementB(ElementB element) {
		count += element.getValue();		
	}

	@Override
	public void visitCompositeElement(CompositeElement element) {
		count += element.getValue();		
	}

	@Override
	public int getCount() {
		return count;
	}	
}
