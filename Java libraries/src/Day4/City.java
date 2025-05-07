package Day4;

class City {
	String name;
	int pincode;

	City(String name,int pincode){
		this.name=name;
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		return " pincode of "+name+" is "+pincode;
	}

}
