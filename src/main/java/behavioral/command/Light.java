package behavioral.command;

/**
 * Receiver
 * <p>
 * Created by stathis on 6/1/2017.
 */
public class Light {

	private String name;

	private boolean isOn = false;

	public boolean isOn() {
		return isOn;
	}

	public Light(String name) {
		this.name = name;
	}

	public void toggle() {
		if (isOn) {
			off();
		} else {
			on();
		}
		isOn = !isOn;
	}

	public void on() {
		System.out.println(name + ": Light.on");
	}

	public void off() {
		System.out.println(name + ": Light.off");
	}
}
