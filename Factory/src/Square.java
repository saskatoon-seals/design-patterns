
public class Square implements Product {
	
	static {
		ProductFactory.instance().registerProduct(Square.class.getName(), new Square());
	}
	
	public Square createProduct() {
		return new Square();
	}
}
