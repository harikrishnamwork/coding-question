package behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by stathis on 6/1/2017.
 */
public class InterpreterEveryDayDemo {

	public static void main(String[] args) {
		String input = "Lions, and tigers, and bears. Oh my!";

		Pattern pattern = Pattern.compile("(lion|cat|wolf|tiger|liger|human|bear|Lion)");
		Matcher m = pattern.matcher(input);

		while (m.find()) {
			System.out.println("Found a: " + m.group());
		}

	}

}
