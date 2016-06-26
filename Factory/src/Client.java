/* Intent: 
 *  1. creates objects without exposing the instantiation logic to the client.
 *  2. refers to the newly created object through a common interface
 *  
 * Advantages:
 *  1. New shapes can be added without changing a single line of code in the framework/client
 *  2. factory implementations that allow adding new products without even modifying the factory class
 *     (this is called product registration)
 *     
 * Use case:
 *  1. When type of object instantiation is dependent on runtime parameters (e.g. user input)
 */

public class Client {
	
	//This method loads first and it then loads the following classes
	static {
		try {
			Class.forName("Square");
			Class.forName("Circle");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//If "Circle" or "Square" are parameters that are given to main method, 
	//then client code never has to change, even when new shapes are added to the system.
	public static void main(String[] args) {
		Product circle = Factory.createProduct("Circle");
		Product square = ProductFactory.instance().createProduct("Square");
		
		System.out.println(circle.getClass());
		System.out.println(square.getClass());
	}
}
