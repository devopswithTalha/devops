package Day4;

class Person {
	String name;
	int age;

	Person(String name,int age){
		this.name=name;
		this.age=age;

	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person) obj;
			return this.age==p.age && this.name.equals(p.name);
		}
		return false;

	}
	public static void main(String[] args) {
		Person p1= new Person("Talha",31);
		Person p2= new Person("Talha",31);
		System.out.println(p1.equals(p2));
	}
}
