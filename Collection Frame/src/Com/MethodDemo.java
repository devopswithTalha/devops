package Com;

import java.util.ArrayList;

class MethodDemo {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		ArrayList y = new ArrayList();
		y.add(x); // y.addAll(x);
		y.add(30);
		
		System.out.println("Elements ->"+y+"& size->"+y.size());
	}

}
/**
 * 1.If we use y.addAll(x);-> All the objects of 1 collection is added into 
 * another collection 1 by 1 (Sequentially)
 *Therefore Elements are [10,20,30] and size is 3.
 *
 *2. If we use y.add(x); ->all the objects of 1 collecction is added into
 *another Collection as a single object.
 *Therefore Elements are [[10,20],30] (nested list) and size is 2.
 */
