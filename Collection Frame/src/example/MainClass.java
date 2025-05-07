package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(10.5);
		al.add(10.6);

		// forward traversing
		Iterator<Double> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("************");

		// Forward & Backward Travesing
		ListIterator<Double> li =al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("----------");

		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("******************");

		// Backward Traversing -> ListIterator
		ListIterator<Double> ii= al.listIterator(al.size());
		while(ii.hasPrevious()) {
			System.out.println(ii.previous());
		}

	}


}
