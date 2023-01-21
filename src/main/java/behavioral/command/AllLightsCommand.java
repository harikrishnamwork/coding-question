package behavioral.command;

import java.util.List;

/**
 * Created by stathis on 6/1/2017.
 */
public class AllLightsCommand implements Command {

	private List<Light> lights;

	public AllLightsCommand(List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		for (Light light : lights) {
			if (light.isOn()) {
				light.toggle();
			}
		}
	}
}
