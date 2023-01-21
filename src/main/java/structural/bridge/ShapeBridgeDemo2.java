package structural.bridge;

/**
 * Created by stathis on 19/2/2017.
 */
public class ShapeBridgeDemo2 {

	public static void main(String[] args) {

		Color blue = new Blue();

		Shape circle = new Circle(blue);

		circle.applyColor();

	}

}
