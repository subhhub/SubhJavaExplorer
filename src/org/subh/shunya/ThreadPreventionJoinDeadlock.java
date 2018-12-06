package org.subh.shunya;

public class ThreadPreventionJoinDeadlock {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(" Main Thread Deadlock");
		Thread.currentThread().join();
	}
	
}
