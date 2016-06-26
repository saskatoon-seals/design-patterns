
public class Circle implements Product {
	
	//When this class is loaded, this method executes first (a new instance is created and registered)
	static {
		ProductFactory.instance().registerProduct(Circle.class.getName(), new Circle());
	}
	
	public Circle createProduct() {
		return new Circle();
	}
}
