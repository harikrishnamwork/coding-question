package structural.bridge;

/**
 * Created by stathis on 19/2/2017.
 */
public  class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	public void applyColor() {
		color.applyColor();
	}
}
