package behavioral.chainofresponsibility;

/**
 * Created by stathis on 30/12/2016.
 */
public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director bryan = new Director();
		VP crystal = new VP();
		CEO jeff = new CEO();

		bryan.setSuccessor(crystal);
		crystal.setSuccessor(jeff);

		Request request = new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);

		request = new Request(RequestType.PURCHASE, 100);
		bryan.handleRequest(request);

		request = new Request(RequestType.PURCHASE, 2000);
		bryan.handleRequest(request);

	}

}
