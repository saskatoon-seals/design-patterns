//Client

package delegation;
import datastructures.Node;

public class TreeDisplay {
	TreeAccessorDelegate delegate;
	
	//Can use a different adaptation strategy by substituting a different Delegate object
	void setDelegate(TreeAccessorDelegate delegate) {
		
	}
	
	void display() {
		
	}
	
	void buildTree(Node node) {
		//Why is passing itself to the delegate object needed? -> so that delegate can reuse methods
		//from the client (that would otherwise inherit them)
		delegate.getChildren(this, node);
		
		delegate.createGraphicNode(this, node);
	}
	
	public static void main(String... args) {
		TreeDisplay treeDisplay = new TreeDisplay();
		
		treeDisplay.setDelegate(new DirecotryBrowser());
	}
}
