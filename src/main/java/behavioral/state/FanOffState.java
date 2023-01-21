package behavioral.state;

/**
 * Created by stathis on 30/1/2017.
 */
public class FanOffState extends State {

	private Fan fan;

	public FanOffState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("FanOffState.handleRequest");
		fan.setState(fan.getFanLowState());
	}

	@Override
	public String toString() {
		return "FanOffState{" +
				"fan=" + fan +
				'}';
	}
}
