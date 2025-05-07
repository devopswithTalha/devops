package defaultsorting;

import java.util.TreeSet;
import java.lang.*;

class CarMainClass {
	public static void main(String[] args) {

		Car c1= new Car(200000);
		Car c2= new Car(300000);
		Car c3= new Car(400000);

		TreeSet<Car> ts= new TreeSet<Car>();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);

		for(Car c : ts) {
			System.out.println(c);
		}

	}

}
