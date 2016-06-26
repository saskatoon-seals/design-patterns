/* The logic of creation is separated from the actual steps of creation so that different composite
 * objects can be created from the same set of simple ones. 
 */
public class ConcreteBuilder extends Builder {
	//The final composite object that is being constructed is contained within builder
	//that is slowly building it.
	StringBuffer device;
	
	public ConcreteBuilder() {
		device = new StringBuffer();
	}
	
	void addItemA(String input) {
		device.append(String.format("%s, %s;", input, input));
	}
	
	void addItemB(String input) {
		device.append(String.format("%s", input));
	}
	
	String build() {
		return device.toString();
	}
}
