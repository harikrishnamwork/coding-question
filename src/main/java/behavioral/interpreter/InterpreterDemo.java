package behavioral.interpreter;

/**
 * Created by stathis on 6/1/2017.
 */
public class InterpreterDemo {

	public static void main(String[] args) {

		String context = "Lions";
		//String context = "Tigers";
		//String context = "Lions Tigers";
		//String context = "Bears";
		//String context = "Lions Bears";
		//String context = "Tigers BEars";

		Expression define = buildInterpreterTree();

		System.out.println(context + " is " + define.interpret(context));

	}


	static Expression buildInterpreterTree() {
		return new TerminalExpression("Lions");
	}

}
