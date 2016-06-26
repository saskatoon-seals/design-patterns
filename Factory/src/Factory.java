/* Shitty implementation
 * Factory is aware of products
 * No decoupling between factory and products 
 */

public class Factory {
	final static String CIRCLE_ID = Circle.class.getName();
	final static String SQUARE_ID = Square.class.getName();
	
	public static Product createProduct(String ProductId) {
		if(ProductId.compareTo(CIRCLE_ID) == 0) {
			return new Circle();
		}
		else if(ProductId.compareTo(SQUARE_ID) == 0) {
			return new Square();
		}
		return null;
	}
}
