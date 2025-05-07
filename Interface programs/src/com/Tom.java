package com;

class Tom implements Person {

	@Override
	public void eat() {
		System.out.println("eating biryani");
	}
	public static void main(String[] args) {
		System.out.println("Age:"+Person.age);
		Tom t=new Tom();
		t.eat();
	}

}
