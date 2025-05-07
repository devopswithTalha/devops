package customthread;

class Jerry implements Runnable {

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		for(int j=6;j<=10;j++) {
			System.out.println(t.getName()+" is printing "+j);
			try {
				t.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();

			}
		}

	}


}
