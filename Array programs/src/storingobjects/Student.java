package storingobjects;

public class Student {
	int age;
	Student(int age){
		this.age=age;
	}
	public static void main(String[] args) {
		Student s1=new Student(10);
		Student s2=new Student(30);
		Student[] std= {s1,s2};
		for(int i=0;i<std.length;i++) {
			System.out.println("age is"+std[i].age);
		}

	}
}