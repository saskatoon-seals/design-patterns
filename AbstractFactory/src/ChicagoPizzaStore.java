
public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String pizzaStyle) {
		if(pizzaStyle.equals(MARGERITA_PIZZA_STYLE)) {
			return new ChicagoPizzaMargerita();
		}
		return null;
	}
}
