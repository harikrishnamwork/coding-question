package structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by stathis on 18/2/2017.
 */
public class Demo {

	public static void main(String[] args) {
		Integer[] arrayOfInts = new Integer[] {42,43, 44};

		List<Integer> integerList = Arrays.asList(arrayOfInts);

		System.out.println(arrayOfInts);
		System.out.println(integerList);
	}

}
