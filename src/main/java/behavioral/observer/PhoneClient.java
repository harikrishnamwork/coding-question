package behavioral.observer;

/**
 * Created by stathis on 29/1/2017.
 */
public class PhoneClient extends Observer {

	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " sent from phone");
	}

	@Override
	void update() {
		System.out.println("PhoneClient.update: " + subject.getState());
	}
}
