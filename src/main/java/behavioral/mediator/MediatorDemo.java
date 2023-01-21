package behavioral.mediator;

import behavioral.command.Command;
import behavioral.command.Light;

/**
 * Created by stathis on 14/1/2017.
 */
public class MediatorDemo {

	public static void main(String[] args) {

		Mediator mediator = new Mediator();

		Light light1 = new Light("light1");
		Light light2 = new Light("light2");

		mediator.registerLight(light1);
		mediator.registerLight(light2);

		Command turnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);

		turnAllLightsCommand.execute();
		turnOffAllLightsCommand.execute();

	}
}
