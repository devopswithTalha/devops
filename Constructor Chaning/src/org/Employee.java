package org;

public class Employee {
	int id;
String name;
double Salary;
Employee(int id){
	this.id=id;

}
Employee(int id,String name){
this(id);
this.name=name;
}
Employee(int id,String name,double salary){
	this(id,name);
	this.Salary=salary;
}
public static void main(String[] args) {
	Employee emp=new Employee(101,"Talha",6.0);
	System.out.println("Id num:"+emp.id);
	System.out.println("Name :"+emp.name);
	System.out.println("salary :"+emp.Salary);
}
}
