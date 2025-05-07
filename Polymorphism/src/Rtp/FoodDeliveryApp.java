package Rtp;

class FoodDeliveryApp {
	void orderFood() {
		System.out.println("Ordering Food");
	}

}
class Swiggy extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("Ordering Pizza from Swiggy");
	}
}
class Zomato extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("Ordering Burger From Zomato");
	}
}
