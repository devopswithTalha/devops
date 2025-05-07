package interviewprograms;

class CricketPlayer {

	String name;
	String country;
	int runs;

	CricketPlayer(String name,String country,int runs){
		this.name=name;
		this.country=country;
		this.runs=runs;
	}
	@Override
	public String toString() {
		return name+"Plays for"+ country +"& has scored"+runs+"runs";
	}

}
