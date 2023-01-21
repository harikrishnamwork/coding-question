package behavioral.chainofresponsibility;

/**
 * Created by stathis on 6/1/2017.
 */
public class CEO extends Handler {

	public void handleRequest(Request request) {
		System.out.println("CEO can handle anything. ");
	}

}
