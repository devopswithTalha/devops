package customsorting;

import java.util.Comparator;

class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee x,Employee y) {
	return x.name.compareTo(y.name);
	}

}
