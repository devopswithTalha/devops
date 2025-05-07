package defaultsorting;

class Hotel implements Comparable<Hotel> {
	String name;
	Double ratings; //wrapper class declaration 
	
	Hotel(String name,double ratings){
		this.name=name;
		this.ratings=ratings;
	}
	
	@Override
	public String toString() {
		return "name : "+name+" Ratings: "+ratings;
		
	}
	@Override
	public int compareTo(Hotel h) {
		return this.ratings.compareTo(h.ratings);
	}
	

}
