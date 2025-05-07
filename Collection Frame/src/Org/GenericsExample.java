package Org;

import java.util.ArrayList;
import java.util.LinkedList;

class GenericsExample {

	public static void main(String[] args) {	
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(20);
		for(Integer i : l) { // for(int i : 1)
			System.out.println(i);
		}

		System.out.println("------------------");

		LinkedList<Double> ll =new LinkedList<Double>();
		ll.add(12.3);
		ll.add(34.5);
		ll.add(12.3);
		for(Double x : ll) { // for ( Double x : 11)
			System.out.println(x);
		}

		System.out.println("-------------------");

		ArrayList al = new ArrayList();
		al.add(10); // a1.add(new Integer(10));
		al.add(1.2); // al.add(new Double(1.2));

		// Generalization or upcasting
		// 1. Object obj = new Integer(10);
		// 2. Object obj = new Double(1.2);


		for(Object obj : al) {
			System.out.println(obj);// Internally -> obj.toString()
			                    // -> toString() is overridden in 
			                    // all Wrapper Classes
		}
	}
}
