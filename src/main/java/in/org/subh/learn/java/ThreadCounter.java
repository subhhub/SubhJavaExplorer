package in.org.subh.learn.java;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadCounter {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("ThreadCounter Main");

		
		final SubscriberCounter sc1 = new SubscriberCounter();
		/*sc1.count();
		sc1.count();
		sc1.count();*/
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <1000; i++) {
					sc1.count();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <1000; i++) {
					sc1.count();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("sc "+sc1.incNum);
		
		System.out.println("Main End");
	}
}

class SubscriberCounter {
	volatile int incNum = 0;
	
	ReentrantLock rt = new ReentrantLock();
	
	void count(){
		
		//rt.lock();
		
		incNum++;
		
		//rt.unlock();
	}
}