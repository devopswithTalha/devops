package defaultsorting;

import java.util.Iterator;
import java.util.TreeSet;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(31,"B");
		Student s2 = new Student(32,"C");
		Student s3 = new Student(25,"A");
		
		TreeSet<Student> t= new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		Iterator<Student> i =t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
