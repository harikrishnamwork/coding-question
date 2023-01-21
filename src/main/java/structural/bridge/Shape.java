package structural.bridge;

/**
 * Created by stathis on 19/2/2017.
 */
public abstract class Shape {

	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract public void applyColor();
}
