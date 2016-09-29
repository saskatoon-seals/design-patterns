
public class RequestHandlerA extends RequestHandler {

	public void handleRequest(Request request) {
		if (request.getValue() < 0) {
			System.out.println(request.getDescription());
		}
		else {
			super.nextRequestHandler.handleRequest(request);
		}
	}
}
