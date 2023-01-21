package behavioral.state;

/**
 * Created by stathis on 30/1/2017.
 */
public class FanHighState extends State {

	private Fan fan;

	public FanHighState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("FanHighState.handleRequest");
		fan.setState(fan.getFanLowState());
	}

	@Override
	public String toString() {
		return "FanHighState{" +
				"fan=" + fan +
				'}';
	}
}
