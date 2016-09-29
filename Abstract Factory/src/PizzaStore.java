/* Abstract Factory offers the interface for creating a FAMILY of related objects, 
 * without explicitly specifying their classes.
 * 
 */
public abstract class PizzaStore {
	final String MARGERITA_PIZZA_STYLE = "Margerita";
	public abstract Pizza createPizza(String pizzaStyle);
}
