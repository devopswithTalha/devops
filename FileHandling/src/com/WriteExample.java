package com;

import java.io.File;
import java.io.FileWriter;

class WriteExample {
	public static void main(String[] args) throws Exception{
		File f=new File("student.txt");

		FileWriter fw=new FileWriter(f,true); //append=true .for concat

		fw.write("Studying java");

		fw.flush();

		fw.close();

		System.out.println("Data stored successfully");

	}

}
