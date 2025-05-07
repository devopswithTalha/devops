package defaultsorting;

class Car implements Comparable<Car> {
	int cost;

	Car(int cost){
		this.cost=cost;
	}

	@Override 
	public String toString() {
		return "cost: "+cost; 
	}
	@Override
	public int compareTo(Car c) {
		return this.cost-c.cost; // return c.cost-this.cost;(for reverse)
	}


}
// this-> Current Object to be inserted
// c-> Already Existing object