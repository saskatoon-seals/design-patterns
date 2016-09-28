package complexcase;

public class OperationA implements Operation<Integer> {
	private Integer count = 0;
	
	@Override
	public void execute(Node node) {
		if (node instanceof Leaf) {
			count += ((Leaf<Integer>) node).getValue();
		}
	}
	
	public Integer getValue() {
		return count;
	}
}
