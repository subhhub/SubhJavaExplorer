package org.subh.shunya;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadReentrantLockBasic {

	public static void main(String[] args) {
		System.out.println("Main Thread Reentrant Lock");
		
		ReentrantLock rl = new ReentrantLock();
		rl.lock();
		rl.lock();
		System.out.println(rl.isLocked());
		System.out.println(rl.isHeldByCurrentThread());
		System.out.println(rl.getQueueLength());
		rl.unlock();
		System.out.println(rl.getHoldCount());
		System.out.println(rl.isLocked());
		rl.unlock();
		System.out.println(rl.isLocked());
		System.out.println(rl.isFair());
	}

}
