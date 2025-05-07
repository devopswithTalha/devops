package traversingobject;

class Mobile {

	String brand;
	int cost;

	Mobile(String brand,int cost){
		this.cost=cost;
		this.brand=brand;
	}
	@Override
	public String toString() {
		return " Brand : "+brand+"Cost : "+cost;

	}
}