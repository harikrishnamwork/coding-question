package creational.builder;

/**
 * Created by stathis on 11/2/2017.
 */
public class BuilderEveryDayDemo {

	public static void main(String[] args) {
		StringBuilder builderi = new StringBuilder();

		builderi.append("1");
		builderi.append("2");
		builderi.append("3");
		builderi.append("1");

		System.out.println(builderi.toString());
	}
}
