package behavioral.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by stathis on 14/1/2017.
 */
public class BikeRepositoryRepo implements Iterable<String> {

	String[] bikes;
	private int index;

	public BikeRepositoryRepo() {
		bikes = new String[10];
		index = 0;
	}

	public void addBike(String bikeName) {
		if (index == bikes.length) {
			String[] largerBikes = new String[bikes.length + 5];
			System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
			bikes = largerBikes;
			largerBikes = null;
		}

		bikes[index] = bikeName;
		index++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<String> iterator() {
		return new Iterator() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}

			@Override
			public String next() {
				return bikes[currentIndex++];
			}
		};
	}

	@Override
	public void forEach(Consumer action) {

	}

	@SuppressWarnings("unchecked")
	@Override
	public Spliterator spliterator() {
		return null;
	}
}
