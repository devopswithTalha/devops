package com;

public class Demo {
	public static void main(String[] args) {
		//array declaration
		int[] a;
		//array creation
		a = new int[3];

		//printing array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		System.out.println("length:"+a.length);

		System.out.println("---------");

		//array initialization
		a[0] = 10;
		a[2] = 50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("---------");

		//array declaration & creation
		double[] x = new double[2];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("length:"+x.length);

		System.out.println("-----");

		x[0]=1.2;
		x[1]=3.4;
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}

}
