package structural.bridge;

/**
 * Created by stathis on 19/2/2017.
 */
public class Square extends Shape{
	public Square(Color color) {
		super(color);
	}

	public void applyColor() {
		color.applyColor();
	}
}
