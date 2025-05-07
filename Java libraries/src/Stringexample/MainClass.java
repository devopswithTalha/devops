package Stringexample;

class MainClass {
	public static void main(String[] args) {

		String s1=new String("Java"); String is immutable
		System.out.println(s1);
		s1.concat(" Program"); new object created but not reference
		System.out.println(s1);

		System.out.println("---------");

		String s2=new String("Java");
		System.out.println(s2);
		s2=s2.concat(" Program");
		System.out.println(s2);

		System.out.println("---------");

		StringBuffer s3=new StringBuffer("Good");
		System.out.println(s3);
		s3.append(" Afternoon");
		System.out.println(s3);

		System.out.println("---------");

		StringBuilder s4=new StringBuilder("Wake");
		System.out.println(s4);
		s4.append("Up!!!");
		System.out.println(s4);
	}
}
