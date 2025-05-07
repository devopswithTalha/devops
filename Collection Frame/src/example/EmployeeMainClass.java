package example;

import java.util.Set;
import java.util.TreeMap;

class EmployeeMainClass {

	public static void main(String[] args) {

		TreeMap<Employee, String> t= new TreeMap<Employee, String>();
		t.put(new Employee(01),"Talha");
		t.put(new Employee(02),"Nabeel");
		t.put(new Employee(03),"fahad");

		Set<Employee> keys=t.keySet();
		for(Employee key:keys) {
			System.out.println(key+" name : "+t.get(key));
		}
	}

}
