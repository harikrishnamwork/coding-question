package behavioral.chainofresponsibility;

/**
 * Created by stathis on 2/1/2017.
 */
public class Director extends Handler {

	public void handleRequest(Request request) {
		if (request.getRequestType().equals(RequestType.CONFERENCE)) {
			System.out.println("Directors can approve conference");
		} else {
			successor.handleRequest(request);
		}

	}
}
