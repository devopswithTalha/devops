package com;

import java.io.File;
import java.util.Date;

class Example {
	public static void main(String[] args) {
		
		// Specifying file name
		File f= new File("student.txt");
		
		// getting milliseconds value
		long milliSeconds = f.lastModified();
		
		// converting millisecond value into date format
		Date d=new Date(milliSeconds);
		
		// printing reference variable ,calls toString()
		System.out.println(d);
		
		File f1=new File("student.txt");
		Date d1= new Date(f1.lastModified());
		System.out.println(d1);
		
		Date d2 = new Date(new File("Student.txt").lastModified());
		System.out.println(d2);
		
		System.out.println(new Date(new File("student.txt").lastModified()));
	}

}
