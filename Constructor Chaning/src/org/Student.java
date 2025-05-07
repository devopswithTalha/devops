package org;

public class Student {
	
	int age;
	String name;
	Student(int age){
		this.age=age;
		
	}
	Student(int age,String name){
		this(age);
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		Student s= new Student(22,"John");
		System.out.println("Age:"+s.age);
		System.out.println("Name:"+s.name);

	}

}
