package delegation;
import datastructures.Node;

//Delegate, target (separate from client)

public interface TreeAccessorDelegate {
	void getChildren(TreeDisplay treeDisplay, Node node);
	void createGraphicNode(TreeDisplay treeDisplay, Node node);
}
