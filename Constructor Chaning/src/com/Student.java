package com;

public class Student {
	Student(int age){
		this("TALHA");
		System.out.println(age);

	}
	Student(String name){
		this(6.2);
		System.out.println(name);

	}
	Student(double height){
		System.out.println(height);
	}

	public static void main(String[] args) {
		Student s=new Student(22);
	}
}
