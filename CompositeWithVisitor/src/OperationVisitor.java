

public interface OperationVisitor<T> {
	void execute(Node node);
	
	T getValue();
}
