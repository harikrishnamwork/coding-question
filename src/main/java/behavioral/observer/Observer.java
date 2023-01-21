package behavioral.observer;

/**
 * Created by stathis on 29/1/2017.
 */
public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
