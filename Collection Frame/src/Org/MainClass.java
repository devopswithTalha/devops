package Org;

import java.util.ArrayList;

class MainClass {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add(10);
		l.add(1.2);
		l.add("java");

		for (Object obj : l) {
			if (obj instanceof String) {
				System.out.println(obj);
			}
		}
	}
}
