package com;

import java.io.File;

class Demo {
	public static void main(String[] args) {
		
		File f=new File("bike");
		boolean result=f.mkdir();
		System.out.println(result);
	}

}
