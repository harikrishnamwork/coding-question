package behavioral.state;

/**
 * Created by stathis on 30/1/2017.
 */
public class FanLowState extends State {

	private Fan fan;

	public FanLowState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("FanLowState.handleRequest");
		fan.setState(fan.getFanMediumState());
	}

	@Override
	public String toString() {
		return "FanOffState{" +
				"fan=" + fan +
				'}';
	}
}
