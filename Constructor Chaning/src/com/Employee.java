package com;

public class Employee {
	Employee(int id){
		this(21,"Talha");
		System.out.println("ID "+id);
		
	}
	Employee(int age,String name){
		System.out.println("age"+age+"name"+name);
	}
	Employee(double salary){
		this(101);
		System.out.println("salary"+salary);
		
	}
	public static void main(String[] args) {
		Employee e=new Employee(3.5);
	}
}
