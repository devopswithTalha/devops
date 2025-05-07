package customthread;

class Swiggy extends Thread {
	
	@Override
	public void run() {
		System.out.println("ordering food");
		Thread t=Thread.currentThread();
		System.out.println("Id: "+t.getId());
		System.out.println("name :"+t.getName());
		System.out.println("Priority:"+t.getPriority());
	}

}
