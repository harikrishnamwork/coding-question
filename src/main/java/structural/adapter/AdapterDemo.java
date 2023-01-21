package structural.adapter;

import java.util.List;

/**
 * Created by stathis on 19/2/2017.
 */
public class AdapterDemo {

	public static void main(String[] args) {

		EmploeeyClient client  = new EmploeeyClient();

		List<Employee> employees = client.getEmployeeList();

		System.out.println(employees);

	}

}
