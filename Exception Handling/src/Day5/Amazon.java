package Day5;

import java.util.Scanner;

class Amazon {

	static void checkEligibility(int marks) throws InvalidMarksException {
		if(marks>=60) {
			System.out.println("apply for amazon interview");
		}
		else {
			throw new InvalidMarksException("Better luck next time!");
		}

	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=sc.nextInt();

		try {
			checkEligibility(marks);
		}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}

		
	}
}
