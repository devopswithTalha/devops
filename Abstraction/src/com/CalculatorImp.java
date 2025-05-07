package com;

class CalculatorImp implements Calculator {
	@Override //Rule-3
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum of"+a+"&"+b+"is"+sum);
	}
	@Override //Rule-3
	public void multiply(int a,int b) {
		System.out.println("Product of"+a+"&"+b+"is"+(a*b));
	}

}
