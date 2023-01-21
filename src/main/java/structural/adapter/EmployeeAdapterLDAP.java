package structural.adapter;

/**
 * Created by stathis on 19/2/2017.
 */
public class EmployeeAdapterLDAP implements Employee {

	private EmployeeLDAP instance;

	public EmployeeAdapterLDAP(EmployeeLDAP instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getCn();
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
