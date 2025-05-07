package customsorting;

import java.util.TreeSet;

class EmployeeMainClass {
	public static void main(String[] args) {

		Employee e1=new Employee(101,"Talha");
		Employee e2=new Employee(102,"Nabeel");
		Employee e3=new Employee(103,"Fahad");

		TreeSet<Employee> t= new TreeSet<Employee>(new EmployeeIdComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);

		TreeSet<Employee> t= new TreeSet<Employee>(new EmployeeNameComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);

		for(Employee emp : t) {
			System.out.println(emp);
		}

	}


}
