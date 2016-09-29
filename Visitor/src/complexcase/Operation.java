package complexcase;

public interface Operation<T> {
	void execute(Node node);
	
	T getValue();
}
