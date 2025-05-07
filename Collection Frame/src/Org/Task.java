package Org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Task {
	public static void main(String[] args) {


		ArrayList<String> al= new ArrayList<String>();
		al.add("Talha");
		al.add("Adeen");
		al.add("Nabeel");
		al.add("Imran");
		al.add("Anees");

		Scanner scan =new Scanner(System.in);
		System.out.println("1.Sort names in ascending order");
		System.out.println("2.Sort names in descending");

		System.out.println("Enter choice:");
		int choice =scan.nextInt();
		scan.close();

		switch(choice) {
		case 1:
			Collections.sort(al);
			for(String s: al) {
				System.out.println(s);
			}
			break;
		case 2:
			Collections.sort(al);
			Collections.reverse(al);
			for(String s : al) {
				System.out.println(s);
			}
			break;
		default:
			System.out.println("Invalid choice");
		}

		/**
		if(choice==1)
		{
		Collections.sort(al);
		System.out.println(al);
		}
		if(choice==2)
		{
		Collections.sort(al);
		System.out.println(al);
		}
		 **/

	}
}
