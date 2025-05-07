package Rtp;

class MainClass {

	//If display(new Developer());-> Employee obj=new Developer();->obj.work()
	//If display(new Tester());-> Employee obj = new Tester();-> obj.work()
	static void display(Employee obj) {
		obj.work();
	}
	public static void main(String[] args) {

		//1.Upcasting using a method
		display(new Developer());//Rule-3-> upcasting
		display(new Tester());//Rule-3 -> upcasting
		System.out.println("=============");

		//2.upcasting using single reference variable
		Employee emp;
		emp= new Developer();//Rule-3->>upcasting
		emp.work();
		emp=new Tester();//Rule-3 upcasting
		emp.work();

		System.out.println("===========");

		//3.Upcasting using seperate reference variable
		Employee e1= new Developer();//Rule-3-->Upcasting
		e1.work();
		Employee e2=new Tester();//Rule-3 -->upcasting
		e2.work();
	}

}
