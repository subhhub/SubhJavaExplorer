package org.subh.shunya;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadAtomicInteger {

	public static void main(String[] args) {
		
		for (int i = 0; i < 25; i++) {
			Thread t = new AtomicThread();
			t.start();
		}
	}
}

class AtomicVisit{
//	static volatile long visi = 0;
//	static long visi = 0;
	
	static AtomicLong al = new AtomicLong();

	static AtomicBoolean ab = new AtomicBoolean();
}

class AtomicThread extends Thread{
	
	public void run() {
		System.out.println (getName() +" "+ AtomicVisit.al.incrementAndGet() + " ");		//this wrap the complete synchronizatoin block
		
//		System.out.println(getName() +" "+ AtomicVisit.ab.get());
		
		/*synchronized (AtomicVisit.class) {			//synchronization can save from duplicate.
			AtomicVisit.visi++;
			System.out.println (getName() +" "+ AtomicVisit.visi + " ");
		}*/
		
//		AtomicVisit.visi++;			//without synchronization value can be duplicate due to non synchronize
//		System.out.println (getName() +" "+ AtomicVisit.visi + " ");
	}
}

