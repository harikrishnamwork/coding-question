package behavioral.observer;

/**
 * Created by stathis on 30/1/2017.
 */
public class TabletClient extends Observer {
	public TabletClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " sent from tablet");
	}

	@Override
	void update() {
		System.out.println("TabletClient.update");
	}
}
