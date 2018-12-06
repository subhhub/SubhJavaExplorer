package org.subh.shunya;

public class ThreadInterThreadCommunicationWN {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inter Thread Communication ");
		
		ThreadITCWN1 itc = new ThreadITCWN1();
		itc.start();
		
//		Thread.sleep(10000);
		
		synchronized (itc) {
			System.out.println("Main thread trying to call wait method");	// Step 1
			itc.wait();
//			itc.wait(1000);
			System.out.println("Main thread got notification");		//Step 4
			System.out.println(itc.total);	// Step 5
		}
	}

}
class ThreadITCWN1 extends Thread{

	int total = 0;
	public synchronized void run() {
		
//		synchronized (this) {
			System.out.println("Child Thread Starts Calculation ");		//Step 2
			
			for (int i = 0; i < 100; i++) {
				total = total+i;
			}
			System.out.println("Child Thread Trying to Give notification ");	//Step 3
			this.notify();
//			this.notifyAll();
//		}
		
	}
}
