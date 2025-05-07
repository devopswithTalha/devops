package Day4;

public class CityMainClass {
	public static void main(String[] args) {
		City c1=new City("Bengaluru",560001);
		City c2=new City("Tamilnadu",632509);
		City[] c= {c1,c2};

		for (int i=0;i<c.length;i++)
			System.out.println(c[i]);


	}

}
