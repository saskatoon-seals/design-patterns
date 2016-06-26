
public abstract class RequestHandler {
	protected RequestHandler nextRequestHandler;
	
	public void setNextRequestHandler(RequestHandler nextRequestHandler) {
		this.nextRequestHandler = nextRequestHandler;
	}
	
	public abstract void handleRequest(Request request);
}
