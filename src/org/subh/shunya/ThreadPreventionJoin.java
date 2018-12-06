package org.subh.shunya;

public class ThreadPreventionJoin {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread Prevention Home");
		
		//Join Child thread. Main thread will be waiting stage
		ThreadJ1 t1 = new ThreadJ1();
		t1.start();
//		t1.join(10000);
		t1.join();
		
		/*ThreadJ3 t3 = new ThreadJ3();
		t3.start();*/
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main-1 "+i);
		}
		
		//Join Main thread. Child thread will be in waiting stage
		/*ThreadJ2.ct = Thread.currentThread();
		ThreadJ2 t2 = new ThreadJ2();
		t2.start();
		t2.join();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main-1 "+i);
			Thread.sleep(300);
		}*/
		
	}
}


class ThreadJ1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadJ-1 "+1);
		}
	}
}

class ThreadJ2 extends Thread{
	
	static Thread ct;
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				ct.join(1000);
//				ct.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadJ-2 "+i);
		}
	}
}

class ThreadJ3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadJ-3 "+3);
		}
	}
}



