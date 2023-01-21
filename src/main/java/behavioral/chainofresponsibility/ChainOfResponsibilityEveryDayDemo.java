package behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by stathis on 30/12/2016.
 */
public class ChainOfResponsibilityEveryDayDemo {

	public static final Logger logger = Logger.getLogger(ChainOfResponsibilityEveryDayDemo.class.getName());

	public static void main(String[] args) {

		logger.setLevel(Level.FINER);

		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINER);

		logger.addHandler(handler);

		logger.finest("Finest");
		logger.finer("Finer");
		logger.fine("Fine");
	}

}
