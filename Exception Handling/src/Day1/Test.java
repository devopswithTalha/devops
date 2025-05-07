package Day1;

class Test {
	public static void main(String[] args) {
		System.out.println("Starts");

		int[] a= {10,20,30};

		try {
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}

		System.out.println("End");
	}

}
