package in.org.subh.learn.java;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadCounter2 implements Runnable {

	volatile int counter = 1; // a global counter

	static ReentrantLock counterLock = new ReentrantLock(true); // enable fairness policy

	public ThreadCounter2() {
    }

    synchronized void incrementCounter() {
         System.out.println(Thread.currentThread().getName() + ": " + counter);
         counter++;
    }

	@Override
	public void run() {
		while (counter < 10) {
			incrementCounter();
		}
	}

	public static void main(String[] args) {
		
		ThreadCounter2 te = new ThreadCounter2();
		
		Thread thread1 = new Thread(te);
		Thread thread2 = new Thread(te);

		thread1.start();
		thread2.start();
	}
}
