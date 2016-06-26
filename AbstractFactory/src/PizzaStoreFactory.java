
public class PizzaStoreFactory {
	private static PizzaStore pizzaStore;
	private static final String NY_PIZZA_STORE = "New York Pizza Store";
	private static final String CHICAGO_PIZZA_STORE = "Chicago Pizza Store";
	
	public static PizzaStore createPizzaStore(String pizzaStoreSelection) {
		if(pizzaStoreSelection.equals(NY_PIZZA_STORE)) {
			pizzaStore = new NYPizzaStore();
		}
		else if(pizzaStoreSelection.equals(CHICAGO_PIZZA_STORE)) {
			pizzaStore = new ChicagoPizzaStore();
		}
		return pizzaStore;
	}
}
