
public class Client {

	public static void main(String[] args) {
		RequestHandler firstRequestHandler = new RequestHandlerA();
		RequestHandler secondRequestHandler = new RequestHandlerB();
		firstRequestHandler.setNextRequestHandler(secondRequestHandler);
		
		//Added a new line just to see if change set can be seen both on GitHub and 
		//EGit if a pull request is created
		System.out.println("Testing GitHub");
		
		//Even more new stuff

		firstRequestHandler.handleRequest(new Request("Ales", -1));
		firstRequestHandler.handleRequest(new Request("Maja", 5));
	}

}
