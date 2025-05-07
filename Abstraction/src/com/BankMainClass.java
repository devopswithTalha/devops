package com;

import java.util.Scanner;

class BankMainClass {
	public static void main(String[] args) {

		System.out.println("welcome to hdfc");
		System.out.println("---------");

		Scanner scan=new Scanner(System.in);
		Bank obj=new BankImp();//upcasting

		while(true) {//Infinite Loop

			System.out.println("1.Deposit Amount \2:withdraw amount");
			System.out.println("3.Check balance\4:Exit");
			System.out.println("enter choice");
			int choice = scan.nextInt();

			switch(choice) {
			case 1:

				System.out.println("Enter amount to be deposited:");
				int amountToDeposit = scan.nextInt();
				obj.deposit(amountToDeposit);
				break;

			case 2:
				System.out.println("Enter amount to be withdrawn:");
				int amountToWithdraw = scan.nextInt();
				obj.deposit(amountToWithdraw);
				obj.checkBalance();

			case 3:
				obj.checkBalance();
				break;
			case 4:
				System.out.println("Thank you : visit Again");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
		}
}