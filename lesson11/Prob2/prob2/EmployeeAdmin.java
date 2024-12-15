package prob2;

import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		// Initialize the list to store valid employees
		List<Employee> result = new ArrayList<>();

		// Filter employees based on criteria
		for (String ssn : socSecNums) {
			Employee employee = table.get(ssn);
			if (employee != null && employee.getSalary() > 80000) {
				result.add(employee);
			}
		}

		// Sort the list using a custom Comparator
		Collections.sort(result, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSsn().compareTo(e2.getSsn());
			}
		});

		return result;
	}
}
