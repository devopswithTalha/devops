package org;

public class MainClass {
	public static void main(String[] args) {

		Amazon a=new Amazon(); // Runnable type of object

		Thread t=new Thread(a); // converting Runnable type into Thread type
		t.setName("Amazon"); // setting / intializing thread name
		t.start(); // invoking start()

		Thread t1=new Thread(new Amazon());
		t1.setName("Amazon");
		t1.start();
		
		Thread t2=new Thread(new Amazon(),"Amazon");
		t2.start();
		
		new Thread(new Amazon(),"Amazon").start();
	}

}
