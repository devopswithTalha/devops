package defaultsorting;

import java.util.TreeSet;

class HotelMainClass {
	public static void main(String[] args) {
		Hotel h1= new Hotel("Taj",4.5);
		Hotel h2= new Hotel("al-Taj",3.5);
		Hotel h3= new Hotel("Benz-Park",2.5);
		
		TreeSet<Hotel> t= new TreeSet<Hotel>();
		t.add(h1);
		t.add(h2);
		t.add(h3);
		
		for(Hotel h:t) {
			System.out.println(h);
		}
	}

}
