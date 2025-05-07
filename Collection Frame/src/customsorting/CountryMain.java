package customsorting;

import java.util.ArrayList;
import java.util.Collections;

public class CountryMain {
	public static void main(String[] args) {
		Country c1=new Country("india",124);
		Country c2=new Country("usa",80);
		Country c3=new Country("China",130);

		ArrayList<Country> a=new ArrayList<Country>();
		a.add(c1);
		a.add(c2);
		a.add(c3);

		for(Country c:a) {
			System.out.println(c);
		}
		System.out.println("-----------");

		//Integer type object using comparator
		Collections.sort(a,new CountryPopulationComparator());
		for(Country c:a) {
			System.out.println(c);
		}

		System.out.println("---------------");

		Collections.sort(a, new CountryNameComparator());
		for(Country c:a)
		{
			System.out.println(c);
		}
	}}
