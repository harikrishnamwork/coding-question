package structural.adapter;

/**
 * Created by stathis on 19/2/2017.
 */
public class EmployeeAdapterCSV implements Employee {

	private EmployeeCSV instance;

	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return new StringBuilder().append(instance.getId()).toString();
	}

	@Override
	public String getFirstName() {
		return instance.getFirstName();
	}

	@Override
	public String getSurName() {
		return instance.getSurName();
	}

	@Override
	public String getEmail() {
		return instance.getEmail();
	}
}
