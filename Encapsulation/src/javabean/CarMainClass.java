package javabean;

public class CarMainClass {
	public static void main(String[] args) {
		Car c = new Car();
		c.setBrand("suzuki");
		c.setCost(50000);
		String brand=c.getBrand();
		int cost=c.getCost();
		System.out.println("Brand :"+brand);
		System.out.println("cost :"+cost);
	}

}
