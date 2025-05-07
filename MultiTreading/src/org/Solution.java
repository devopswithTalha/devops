package org;

public class Solution {
	public static void main(String[] args) {

		Swiggy s=new Swiggy();
		s.setName("Swiggy");
		s.start(); //3

		PhonePe pp=new PhonePe();
		Thread t = new Thread(pp);//3
		t.setName("PhonePe");
		t.start();//4
	}
}
