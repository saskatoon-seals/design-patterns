package simple;
/* When an object is composed of smaller objects, client knows steps needed to compose 
 * such an object, but every individual part of that object is built by a builder.
 * 
 * A way to create a complex structure without mixing it with the steps for creating it.
 * A trip planner creator is encapsulated within a builder, and client is asking it 
 * to create a trip he wants. 
 * 
 * The client directs the builder to construct the planner.
 * 
 * Builder pattern is used for building composite objects.
 */

//Client == Director == Creator
public class Client {

	public static void main(String[] args) {
		ConcreteBuilder builder = new ConcreteBuilder();		
		Director director = new Director(builder);
		director.composeDevice(args[0]);
		System.out.println(builder.build());
	}

}
