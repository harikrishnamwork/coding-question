package behavioral.state;

/**
 * Created by stathis on 30/1/2017.
 */
public class FanMediumState extends State {

	private Fan fan;

	public FanMediumState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("FanMediumState.handleRequest");
		fan.setState(fan.getFanHigh());
	}

	@Override
	public String toString() {
		return "FanMediumState{" +
				"fan=" + fan.getState() +
				'}';
	}
}
