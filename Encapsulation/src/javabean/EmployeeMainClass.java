package javabean;

import java.util.Scanner;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		Employee emp=new Employee();
		System.out.println("Enter id:");
		int id = scan.nextInt();
		emp.setId(id);

		System.out.println("Enter Name:");
		String name=scan.next();
		emp.setName(name);

		System.out.println("Enter Salary");
		int salary= scan.nextInt();
		emp.setSalary(salary;

		scan.close();

		System.out.println("EMPLOYEE DETAILS");
		System.out.println("Id:"+emp.getId());



	}

}
