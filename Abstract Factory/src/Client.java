/* When client wants a different family of objects, it only needs to start using a 
 * different factory, which will generate different objects. 
 */

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore pizzaStore = PizzaStoreFactory.createPizzaStore("Chicago Pizza Store");
		System.out.println(pizzaStore.createPizza("Margerita").getClass());
	}

}
