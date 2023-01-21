package behavioral.template;

/**
 * Created by stathis on 9/2/2017.
 */
public class Person implements Comparable<Person>{

	private String name;

	private Integer age;

	private String phoneNumber;

	public Person(String name, Integer age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age > o.age) {
			return  1;
		}
		if (this.age < o.age) {
			return  -1;
		}
		return 0;
	}
}
