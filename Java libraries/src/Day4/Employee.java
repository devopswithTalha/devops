package Day4;

public class Employee {
	int id;
	Employee(int id){
		this.id=id;
	}
	@Override
	public boolean equals(Object obj) { //1.upcasting:Object obj=new Employee(100);
		if(obj instanceof Employee) { // 2.checks if obj is having employee object
			Employee e =(Employee) obj;//3.Downcasting
			return this.id==e.id; // 4.comparison logic
		}
		return false;

	}
	public static void main(String[] args) {
		Employee e1=new Employee(100);
		Employee e2=new Employee(100);
		System.out.println(e1.equals(e2));
	}

}
