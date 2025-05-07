package customsorting;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country> {

	@Override
	public int compare(Country a,Country b)
	{
		return a.name.compareTo(b.name);

	}

}
