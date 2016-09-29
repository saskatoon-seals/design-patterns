

public class Main {
	
	public static void main(String... args) {
		Node tree1 = new Composite("tree");
		Node node1 = new Composite("node1");
		Node node2 = new Composite("node2");
		node1.addChild(new Leaf("A", 1));
		node1.addChild(new Leaf("B", 2));
		node2.addChild(new Leaf("C", 3));
		node2.addChild(new Leaf("D", 4));
		tree1.addChild(node1);
		tree1.addChild(node2);
		
		Node tree2 = new Composite("tree");
		node1 = new Composite("node1");
		node2 = new Composite("node2");
		node1.addChild(new Leaf("B", 2));
		node1.addChild(new Leaf("A", 1));		
		node2.addChild(new Leaf("C", 3));
		node2.addChild(new Leaf("D", 4));
		tree2.addChild(node1);
		tree2.addChild(node2);
		
		System.out.println(tree1.equals(tree2));
		
		OperationVisitor<Integer> operation = new OperationA();
		tree2.accept(operation);
		System.out.println(operation.getValue());
	}
}
