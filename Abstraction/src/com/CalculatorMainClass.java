package com;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Calculator calc=new CalculatorImp();

		System.out.println("Enter 2 number");
		int a =scan.nextInt();
		int b=scan.nextInt();

		calc.add(a, b);
		calc.multiply(a, b);
		scan.close();
	}

}
