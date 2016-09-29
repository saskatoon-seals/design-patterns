package complexcase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Leaf<T> implements Node {

	private String name;
	private T value;
	
	public Leaf(String name, T value) {
		this.name = name;
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	@Override
	public List<Node> getChildren() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName() {
		return name;
	}
	
	//APIs
	
	@Override
	public void addChild(Node node) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean equals(Object node) {
		Leaf<T> tempNode = (Leaf<T>) node;
		
		return this.name.equals(tempNode.name) &&
			   this.value.equals(tempNode.value);
	}

	@Override
	public boolean exists(Node node) {
		return this.equals(node);
	}

	@Override
	public void accept(Operation operation) {
		operation.execute(this);
	}	
}
