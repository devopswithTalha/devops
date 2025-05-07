package storingobject;

import java.util.ArrayList;

class StudentMainClass {

	public static void main(String[] args) {

		Student s1 = new Student(32,"Talha");
		Student s2 = new Student(33,"Nabeel");

		ArrayList<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);

		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));

		}

		System.out.println("--------------");

		for(Student s: l) {
			System.out.println(s);

		}

	}
}

