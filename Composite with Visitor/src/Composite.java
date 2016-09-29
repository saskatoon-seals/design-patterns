

import java.util.ArrayList;
import java.util.List;

public class Composite implements Node {
	
	private String name;
	private List<Node> children = new ArrayList<>();
	
	public Composite(String name) {
		this.name = name;
	}
	
	@Override
	public List<Node> getChildren() {
		return children;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	//APIs
	
	@Override
	public void addChild(Node node) {
		children.add(node);
	}
	
	@Override
	public boolean equals(Object node) {
		if (!this.getName().equals(((Node)node).getName())) {
			return false;
		}
			
		for (Node child : children) {				
			if(!((Node)node).exists(child)) {
				return false;
			}
		}			
		
		return true;		
	}	
	
	@Override
	public boolean exists(Node node) {		
		for (Node child: children) {			
			if (child.equals(node)) {
				return true;
			}
		}		
		return false;
	}
	
	@Override
	public void accept(OperationVisitor operation) {
		operation.execute(this);
		for (Node child : children) {
			child.accept(operation);
		}
	}
}
