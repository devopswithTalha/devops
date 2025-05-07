package org;

class John extends Student implements Hotel,Theatre{

	@Override
	public void study() {
		System.out.println("Studying");
	}
	@Override
	public void eatFood() {
		System.out.println("eating food");

	}
	@Override
	public void watchMovie() {
		System.out.println("watching movie");

	}
	public static void main(String[] args) {
		John j = new John();
		j.study();
		j.eatFood();
		j.watchMovie();
	}

}
