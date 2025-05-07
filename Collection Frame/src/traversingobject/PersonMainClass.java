package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMainClass {
	public static void main(String[] args) {
		ArrayList<Person> al= new ArrayList<Person>();
		Person p1=new Person(32,"Talha",6.2);
		Person p2=new Person(33,"Nabeel",6.0);

		al.add(p1);
		al.add(p2);

		Iterator<Person> i =al.iterator();

		while(i.hasNext())
		{
			Person p= i.next();
			System.out.println("Age: "+p.age+" Name: "+p.name+" Height"+p.height);

		}
	}

}
