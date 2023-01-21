package structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stathis on 19/2/2017.
 */
public class EmploeeyClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();

		Employee employee = new EmployeeDB("number", "name", "surname", "mail@mail.mail");

		employees.add(employee);

		// LDAP employee, use of structural.adapter
		EmployeeLDAP employeeLDAP = new EmployeeLDAP("cn", "givenName", "surname", "mailaki");

		employees.add(new EmployeeAdapterLDAP(employeeLDAP));

		// CSV employee, second structural.adapter
		EmployeeCSV employeeCSV = new EmployeeCSV("id,name,surname,mail@mail");
		employees.add(new EmployeeAdapterCSV(employeeCSV));

		return employees;
	}

}
