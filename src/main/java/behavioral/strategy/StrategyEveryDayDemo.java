package behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by stathis on 11/2/2017.
 */
public class StrategyEveryDayDemo {

	public static void main(String[] args) {
		Person bryan = new Person("bryan", 23, "6974578344");
		Person mark = new Person("mark", 23, "6974578344");
		Person chris = new Person("chris", 23, "6974578344");

		List<Person> persons = new ArrayList<>();
		persons.add(bryan);
		persons.add(mark);
		persons.add(chris);

		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() > o2.getAge() ? 1 : 0;
			}
		});

		System.out.println("sorted by age");
		printContents(persons);
	}

	private static void printContents(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("person = " + person);
		}
	}

}
