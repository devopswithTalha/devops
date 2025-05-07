package customsorting;

import java.util.Comparator;

class EmployeeIdComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee x,Employee y) {
		return x.id-y.id;
	}

}
