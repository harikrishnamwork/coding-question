package creational.builder;

/**
 * Created by stathis on 11/2/2017.
 */
public class BuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();

		builder.bread("wheat")
				.condiments("lettuce")
				.dressing("mustard")
				.meat("ham");

		LunchOrder order = builder.build();

		System.out.println(order);

		builder = new LunchOrder.Builder();

		builder.bread("wheat")
				.meat("ham");

		order = builder.build();

		System.out.println(order);
	}
}
