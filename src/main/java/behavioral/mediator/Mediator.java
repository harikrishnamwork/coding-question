package behavioral.mediator;

import behavioral.command.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stathis on 14/1/2017.
 */
public class Mediator {

	private List<behavioral.command.Light> lights = new ArrayList<>();

	public void registerLight(Light light) {
		lights.add(light);
	}

	public void turnOnAllLights() {
		for (Light light : lights) {
			if (!light.isOn()) {
				light.toggle();
			}
		}
	}

	public void turnOffAllLights() {
		for (Light light : lights) {
			if (light.isOn()) {
				light.toggle();
			}
		}
	}
}
