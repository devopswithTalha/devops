package customthread;

class MainClass {
	public static void main(String[] args) {
		Swiggy s=new Swiggy();
		s.setName("Swiggy");
		s.setPriority(8);
		s.start();
		

	}
}
