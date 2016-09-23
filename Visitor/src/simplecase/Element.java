package simplecase;

public interface Element {

	void accept(Visitor visitor);
	int getValue();
}
