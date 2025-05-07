package example;

import java.util.Set;
import java.util.TreeMap;

class MovieMainClass {
	
public static void main(String[] args) {
	
	TreeMap<Movie,Double> t=new TreeMap<Movie,Double>(new MovieNameComparator());
	t.put(new Movie("ddlj"),1.5);
	t.put(new Movie("dada"),2.5);
	t.put(new Movie("Amaron"),3.5);
	
	Set<Movie> keys=t.keySet();
	for(Movie key:keys) {
		System.out.println(key+" Ratings :"+t.get(key));
	}
	
	
	
	
}

}
