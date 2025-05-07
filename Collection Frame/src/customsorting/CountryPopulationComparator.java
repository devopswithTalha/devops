package customsorting;

import java.util.Comparator;

public class CountryPopulationComparator implements Comparator<Country>{

	@Override
	public int compare(Country x,Country y) {
		return x.population-y.population;
	}
}

