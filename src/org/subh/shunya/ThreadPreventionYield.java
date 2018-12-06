package org.subh.shunya;

public class ThreadPreventionYield {

	public static void main(String[] args) {
		System.out.println("Thread Prevention Home");
		
		Thread1 t1 = new Thread1();
//		t1.setPriority(10);
		t1.start();
		
		/*Thread2 t2 = new Thread2();
//		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();*/
		
		/*Thread3 t3 = new Thread3();
		t3.start();*/
		
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main-1 ");
		}
		
		System.out.println("Thread Prevention End");
	}
}


class Thread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-1 "+i);
			yield();							//Always class yield method inside a thread
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-2 "+i);
//			Thread.yield();
		}
	}
}
class Thread3 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-3 ");
		}
	}
}


