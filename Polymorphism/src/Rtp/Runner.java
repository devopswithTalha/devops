package Rtp;

class Runner {

	static void selectApp(FoodDeliveryApp app) {
		
	app.orderFood();
}
public static void main(String[] args) {
	selectApp(new Swiggy());
	selectApp(new Zomato());
	System.out.println("===============");
	FoodDeliveryApp f;
	f=new Swiggy();
	f.orderFood();
	f=new Zomato();
	f.orderFood();
	System.out.println("++++++++++");
	FoodDeliveryApp f1= new Swiggy();
	f1.orderFood();
	FoodDeliveryApp f2 =new Zomato();
	f2.orderFood();
}
}
