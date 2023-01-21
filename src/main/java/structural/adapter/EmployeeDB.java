package structural.adapter;

/**
 * Created by stathis on 19/2/2017.
 */
public class EmployeeDB implements Employee {

	private String id;
	private String name;
	private String surname;
	private String mail;

	public EmployeeDB(String id, String name, String surname, String mail) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mail = mail;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getFirstName() {
		return name;
	}

	@Override
	public String getSurName() {
		return surname;
	}

	@Override
	public String getEmail() {
		return mail;
	}
}
