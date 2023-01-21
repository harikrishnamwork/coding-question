package behavioral.state;

/**
 * Created by stathis on 30/1/2017.
 */
public class Fan {

	State fanOff;

	State fanLow;

	State fanMedium;

	State fanHigh;

	State state;

	public Fan() {
		fanOff = new FanOffState(this);
		fanLow = new FanLowState(this);
		fanMedium = new FanMediumState(this);
		fanHigh = new FanHighState(this);

		state = fanOff;
	}

	public void pullChain() {
		state.handleRequest();
	}

	public State getOffLowState() {
		return fanOff;
	}

	public State getFanLowState() {
		return fanLow;
	}

	public State getFanMediumState() {
		return fanMedium;
	}

	public State getFanHigh() {
		return fanHigh;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
