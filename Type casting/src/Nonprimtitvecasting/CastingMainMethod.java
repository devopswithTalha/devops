package Nonprimtitvecasting;

class CastingMainMethod {
	public static void main(String[] args) {

		//upcasting
		Father f=new Son();

		System.out.println(f.name);
		System.out.println("------------");
		//downcasting
		Son s = (Son)f;
		System.out.println(s.name);
		System.out.println(s.age);
	}
}
