package behavioral.observer;

/**
 * Created by stathis on 30/1/2017.
 */
public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();

		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);

		phoneClient.addMessage("Test message");
//		tabletClient.addMessage("Another test message");

	}

}
