package Generalization;

import java.util.ArrayList;

class MainClass {
	public static void main(String[] args) {
		ArrayList<Person> l=new ArrayList();
		l.add(new Student());
		l.add(new Employee());
		
		for(Person obj:l) {
			if(obj instanceof Student) {
				Student s=(Student)obj;
				System.out.println("Marks :"+s.marks);
			}
			else if(obj instanceof Employee) {
				Employee e=(Employee) obj;
				System.out.println("Salary:"+e.salary);
			}
		}
	}

}
