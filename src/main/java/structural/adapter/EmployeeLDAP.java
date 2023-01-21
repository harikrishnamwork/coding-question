package structural.adapter;

/**
 * Created by stathis on 19/2/2017.
 */
public class EmployeeLDAP  {

	private String cn;
	private String givenName;
	private String surname;
	private String mail;

	public EmployeeLDAP(String cn, String givenName, String surname, String mail) {
		this.cn = cn;
		this.givenName = givenName;
		this.surname = surname;
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}

	public String getFirstName() {
		return givenName;
	}

	public String getSurName() {
		return surname;
	}

	public String getEmail() {
		return mail;
	}
}
