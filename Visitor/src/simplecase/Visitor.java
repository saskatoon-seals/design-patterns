package simplecase;

public interface Visitor {

	void visitElementA(ElementA element);
	void visitElementB(ElementB element);
	void visitCompositeElement(CompositeElement element);
	
	int getCount();
}
