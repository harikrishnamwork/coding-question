package behavioral.command;

/**
 * Invoker
 * <p>
 * Created by stathis on 6/1/2017.
 */
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
