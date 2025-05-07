package com;

class Customer implements Flipkart {
	@Override
	public void buy(String product) {
		System.out.println("Buying :" +product);
	}
	public void pay(int amount) {
		System.out.println("paying :" +amount);
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.buy("Watch");
		c.pay(2000);
	}
}
