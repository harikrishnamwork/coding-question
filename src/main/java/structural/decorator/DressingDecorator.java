package structural.decorator;

/**
 * Created by stathis on 28/2/2017.
 */
public class DressingDecorator extends SandwichDecorator {
	public DressingDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public String make() {
		return super.make() + addDressing();
	}

	private String addDressing() {
		return " mustard";

	}
}
