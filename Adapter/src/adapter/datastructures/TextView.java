package adapter.datastructures;

public abstract class TextView {
	public void getOrigin(Coordinate x, Coordinate y) {
		
	}
	
	public void getExtent(Coordinate width, Coordinate height) {
		
	}
	
	protected abstract boolean isEmpty();
	
	protected static boolean containsElements() {
		return false;
	}
}
