package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;

class CricketPlayerMainClass {
	public static void main(String[] args) {
		CricketPlayer c1=new CricketPlayer("Talha","India",10000);
		CricketPlayer c2=new CricketPlayer("Nabeel","Pakistan",20000);
		CricketPlayer c3=new CricketPlayer("Sayeed","Australia",5000);
		CricketPlayer c4=new CricketPlayer("Sajid","SA",20009);
		CricketPlayer c5=new CricketPlayer("Yasir","WI",15000);

		ArrayList<CricketPlayer> al=new ArrayList<CricketPlayer>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);

		Collections.sort(al,new CricketPlayerRunComparator());

		System.out.println("Cricket player with Highest Runs");
		System.out.println(al.get(al.size()-1));

		System.out.println("-----");

		System.out.println("Cricket player lowest");
		System.out.println(al.get(0));

		System.out.println("----------");

		System.out.println("Cricket player whose name starts with s");

		for(CricketPlayer cp: al)
		{
			if(cp.name.startsWith("S") || cp.name.startsWith("s") {
				System.out.println();
			}
		}

		System.out.println("-----------------");
		System.out.println("Cricket Player whose represent india");
		for(CricketPlayer cp:al) {
			if(cp.country.equals("India")) {
				System.out.println(cp);

			}
		}

	}
}
