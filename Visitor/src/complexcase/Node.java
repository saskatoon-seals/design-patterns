package complexcase;

import java.util.List;

public interface Node {

	void addChild(Node node);
	
	boolean exists(Node node);
	
	List<Node> getChildren();
	
	String getName();
	
	void accept(Operation operation);
}
