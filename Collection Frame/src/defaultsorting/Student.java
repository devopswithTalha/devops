package defaultsorting;

class Student implements Comparable<Student>{

	int age;
	String name;

	Student(int age,String name){
		this.age=age;
		this.name=name;

	}
	@Override
	public String toString() {
		return name+" is "+age+" years old ";
	}
	
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

}

 /** this-> current object to be inserted
  * s-> already existing object
  * 
  * Sorting based on age(int)
  * 1.ascending order ->return this.age-s.age;
  * 2.descending order -> return s.age-this.age;
  * 
  * for String comparision,we should use compareTo() of String class
  * Sorting based on name(String)
  * 1.Ascending order-> return this.name.compareTo(s.name);
  * 2.Descending order->return s.name.compareTo(this.name);
  * 
  * */
