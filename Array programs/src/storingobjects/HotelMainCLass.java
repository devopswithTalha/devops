package storingobjects;

public class HotelMainCLass {
	public static void main(String[] args) {
		Hotel h1= new Hotel("Taj",4.5);
		Hotel h2= new Hotel("ITC",4.6);
		
		Hotel[] h = {h1,h2};
		for(int i=0;i<h.length;i++) {
			System.out.println("Rating of"+h[i].name+" hotel is"+h[i].rating);
		}
		
	}

}
