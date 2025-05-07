package Day1;

import java.util.Scanner;

class Demo {
	public static void main(String[] args) {

		System.out.println("Start");
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number:");
		int a =sc.nextInt(); //10

		System.out.println("Enter the second number");
		int b =sc.nextInt(); //0

		sc.close();

		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Dabbafellow do not divide by 0");
		}

		System.out.println("Ends");
	}

}
