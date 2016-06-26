
public class Client {

	public static void main(String[] args) {
		RequestHandler firstRequestHandler = new RequestHandlerA();
		RequestHandler secondRequestHandler = new RequestHandlerB();
		firstRequestHandler.setNextRequestHandler(secondRequestHandler);

		firstRequestHandler.handleRequest(new Request("Ales", -1));
		firstRequestHandler.handleRequest(new Request("Maja", 5));
	}

}
