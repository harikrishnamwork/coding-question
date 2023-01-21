package behavioral.command;

import java.util.Arrays;
import java.util.List;

/**
 * Created by stathis on 6/1/2017.
 */
public class CommandDemo {

	public static void main(String[] args) {
		Light light1 = new Light("");
		Light light2 = new Light("");

		List<Light> lights = Arrays.asList(light1, light2);

		Command allCommand = new AllLightsCommand(lights);

		Switch lightSwitch = new Switch();

		lightSwitch.storeAndExecute(allCommand);
		lightSwitch.storeAndExecute(allCommand);
		//Command toggleCommand = new ToggleCommand(light);
		//lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
	}
}
