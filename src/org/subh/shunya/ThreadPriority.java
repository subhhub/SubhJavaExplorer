package org.subh.shunya;

class ThreadPriority {

	public static void main(String arg[]){

//		System.out.println("main thread " +Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(7);
//		System.out.println("main thread priority "+Thread.currentThread().getPriority());
		
		CThread t = new CThread();
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
//		System.out.println("Child Thread Priority "+t.getPriority());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("MThread " +i);
		}
	}
}

class CThread extends Thread{
	
	public void run(){
//		setPriority(10);
		for (int i = 0; i < 10; i++) {
			System.out.println("CThread " +i);
		}
	}
}

