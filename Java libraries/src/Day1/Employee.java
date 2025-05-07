package Day1;

class Employee {
	int id;
	String name;

	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "employee Id of"+name+"is"+id;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Talha");
		Employee e2 = new Employee(102,"Adeen");
		System.out.println(e1);
		System.out.println(e2);
	}

}
