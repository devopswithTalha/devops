package Com;

class Solution {

	//Generalization or upcasting:
	//1.If display (new son())--> Father obj = new son();
	//2. If display ( new Daughter());--> Father obj = new Daughter();

	static void display(Father obj) {
		if(obj instanceof Son) {
			System.out.println("Downcasting to son");
			Son s=(Son) obj;
			System.out.println(s.x+" "+s.y);//10 20
		}
		else if(obj instanceof Daughter) {
			System.out.println("Downcasting to Daughter");
			Daughter d=(Daughter) obj;
			System.out.println(d.x+" "+d.z);
		}
	}

	public static void main(String[] args) {
		display(new Son());
		System.out.println("-----");
		display(new Daughter());
	}

}
