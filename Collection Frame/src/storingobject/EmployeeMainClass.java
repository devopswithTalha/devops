package storingobject;

import java.util.ArrayList;

class EmployeeMainClass {
	public static void main(String[] args) {

		Employee e1 = new Employee(100,"Talha",2.5);
		Employee e2 = new Employee(101,"Nabeel",2.8);
		Employee e3 = new Employee(102,"Fahad",20.0);
		Employee e4 = new Employee(103,"Hussain",15.0);
		Employee e5 = new Employee(104,"Saad",12.0);

		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		System.out.println("Employee details");
		System.out.println("------------");

		for(Employee emp:al)
		{
			System.out.println(emp);
		}
		System.out.println("---------------------");
		
		System.out.println("Employee Details whose name starts with 'T'");
		
		System.out.println("---------");
		
		for (Employee emp: al) {
			if(emp.name.startsWith("T"))
				System.out.println(emp);
		}
		
		System.out.println("------------------");
		System.out.println("Employee details whose salary is between 2.5-3.5");
		
		System.out.println("--------------------");
		for(Employee emp: al)
			if(emp.salary>=2.5 && emp.salary<=3.5)
				System.out.println(emp);
				

	}

}
