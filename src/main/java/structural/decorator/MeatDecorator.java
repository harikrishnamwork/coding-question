package structural.decorator;

/**
 * Created by stathis on 28/2/2017.
 */
public class MeatDecorator extends SandwichDecorator {
	public MeatDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public String make() {
		return super.make() + addMeat();
	}

	private String addMeat() {
		return " turkey";

	}
}
