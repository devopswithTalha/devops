package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileMainClass {
	public static void main(String[] args) {
		ArrayList<Mobile> al= new ArrayList<Mobile>();

		Mobile m1=new Mobile("vivo",15000);
		Mobile m2=new Mobile("Samsung",20000);

		al.add(m1);
		al.add(m2);

		Iterator<Mobile> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
