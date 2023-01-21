package behavioral.chainofresponsibility;

/**
 * Created by stathis on 6/1/2017.
 */
public class VP extends Handler {
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.PURCHASE) {
			if (request.getAmount() < 1500) {
				System.out.println("VPs can purchase up until 1500. ");
			} else {
				successor.handleRequest(request);
			}
		}
	}
}
