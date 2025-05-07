package customsorting;

class Country {
	String name;
	int population;

	Country(String name,int population){
		this.name=name;
		this.population=population;
	}
	@Override
	public String toString() {
		return "country name: "+name+" population :"+population+"crores";
	}

}
