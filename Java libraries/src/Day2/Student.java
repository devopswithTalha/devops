package Day2;

class Student {
	int age;

	Student(int age){
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) { //1.upcasting-> Object obj = new Student(20);
		if(obj instanceof Student) {// 2.Checking if obj is having student object
			Student s=(Student)obj;//3.Downcasting
			return this.age==s.age;//4.Comparison logic ->return  s1.age==s2.age;
		}
		return false;              //5.returning false for negative Scenerio
	}

	public static void main(String[] args) {
		Student s1 = new Student(21);
		Student s2 = new Student(21);
		System.out.println(s1.equals(s2)); // s1.equals(new Student(20))
	}
}
//s1->this
//s2->obj (upcasted reference)->s (Downcasted reference)
// In the above program, upcasting is achieved only when we call/invoke equals() 

