package Day2;

class Car {
	int cost;

	Car(int cost){
		this.cost=cost;

	}
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Car) {
			Car c=(Car)obj;
			return this.cost==c.cost;
		}
		return false;
	}

	public static void main(String[] args) {
		Car c1= new Car(100000);
		Car c2= new Car(100000);
		System.out.println(c1.equals(c2));
	}

}
