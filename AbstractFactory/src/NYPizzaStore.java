
public class NYPizzaStore extends PizzaStore {
	public Pizza createPizza(String pizzaStyle) {
		if(pizzaStyle.equals(MARGERITA_PIZZA_STYLE)) {
			return new NYPizzaMargerita();
		}
		return null;
	}
}
