package org;

class Amazon implements Runnable { // rule-1
	
	@Override// rule-2
	public void run() {
		System.out.println("Purchasing laptop");
	}

}
