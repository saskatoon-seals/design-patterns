package simple;
//Director knows the steps needed to compose an object == ALGORITHM
public class Director {
	Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	void composeDevice(String input) {
		if(input.equals("A")) {
			builder.addItemA(input);
			builder.addItemB(input);
			builder.addItemA(input);
		}
		if(input.equals("B")) {
			builder.addItemB(input);
			builder.addItemA(input);
			builder.addItemB(input);
		}
	}
}
