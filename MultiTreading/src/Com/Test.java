package Com;

class Test {
	public static void main(String[] args) {

		// Default Thread Name
		Thread t1=new Thread();
		System.out.println(t1.getName());
		t1.setName("Car Thread");
		System.out.println(t1.getName());

		System.out.println("---------");

		// Custom Thread Name
		Thread t2= new Thread("bike Thread");
		System.out.println(t2.getName());
	}

}
