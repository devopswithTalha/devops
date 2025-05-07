package defaultsorting;

import java.util.TreeSet;

class EmployeeMainClass {
	public static void main(String[] args) {
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(new Employee(101,"Talha"));
		t.add(new Employee(102,"Nabeel"));
		t.add(new Employee(103,"saad"));
		
		for(Employee e:t) {
			System.out.println(e);
		}
		
	}

	
	

}
