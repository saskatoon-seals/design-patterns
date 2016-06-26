/* Factory Method Pattern
 * 
 * First object serves as a factory creating new objects of it's own type based on request
 * Factory is unaware of products
 * Concrete product objects are registered with the factory 
 * 
 * Drawbacks:
 *  1. This factory can not be used as a singleton ??
 */

import java.util.HashMap;

public class ProductFactory {
	private static ProductFactory productFactory;
	private HashMap<String, Product> registeredProducts; 
	
	private ProductFactory() {
		registeredProducts = new HashMap<String, Product>();
	}
	
	public static synchronized ProductFactory instance() {
		if (productFactory == null) {
			productFactory = new ProductFactory();
		}
		return productFactory;
	}
	
	public void registerProduct(String productId, Product product) {
		registeredProducts.put(productId, product);
	}
	
	public Product createProduct(String productId) {
		return registeredProducts.get(productId).createProduct();
	}
}
