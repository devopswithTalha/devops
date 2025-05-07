package com;

class Customer extends Amazon {
	@Override
	void buy() {
		System.out.println("buying");
	}

	@Override
	void pay() {
		System.out.println("paying");
	}
	public static void main(String[] args) {
		Customer c= new Customer();
		c.buy();
		c.pay();
	}

}
