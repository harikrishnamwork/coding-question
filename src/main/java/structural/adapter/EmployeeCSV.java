package structural.adapter;

import java.util.StringTokenizer;

/**
 * Created by stathis on 19/2/2017.
 */
public class EmployeeCSV {

	private static final String COMMA_DELIMITER = ",";

	private int id;
	private String givenName;
	private String surname;
	private String mail;

	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, COMMA_DELIMITER);

		if (tokenizer.hasMoreElements()) {
			id = Integer.parseInt(tokenizer.nextToken());
		}

		if (tokenizer.hasMoreElements()) {
			givenName = tokenizer.nextToken();
		}


		if (tokenizer.hasMoreElements()) {
			surname = tokenizer.nextToken();
		}


		if (tokenizer.hasMoreElements()) {
			mail = tokenizer.nextToken();
		}



	}

	public int getId() {
		return id;
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
