package structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by stathis on 27/2/2017.
 */
public class DecoratorDemo {

	public static void main(String[] args) throws Exception{


		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

		System.out.println("sandwich: " + sandwich.make());

	}
}
