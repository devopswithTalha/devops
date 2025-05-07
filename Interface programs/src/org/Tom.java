package org;

class Tom extends Employee implements Jspider,Qspider {

	@Override
	public void work() {
		System.out.println("working");
	}
		@Override
		public void developApp() {
			System.out.println("DevelopApp");
		}
		@Override
		public void testApp() {
			System.out.println("Testing app");
		}
		
		public static void main(String[] args) {
			Tom t=new Tom();
			t.work();
			t.developApp();
			t.testApp();
			
		}	
}

