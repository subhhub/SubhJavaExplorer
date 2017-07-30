package in.org.subh.shunya;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadReentrantLockTry extends Thread {

	public static void main(String[] args) {

		/*DisplayLockTry tt = new DisplayLockTry("First Thread");
		DisplayLockTry tt1 = new DisplayLockTry("Second Thread");
		tt.start();
		tt1.start();*/
		
		DisplayLockTryLoop ttl = new DisplayLockTryLoop("First Thread");
		DisplayLockTryLoop ttl1 = new DisplayLockTryLoop("Second Thread");
		ttl.start();
		ttl1.start();
	}
}

class DisplayLockTry extends Thread {
	static ReentrantLock rt = new ReentrantLock(); // lock should be unique

	public DisplayLockTry(String name) {
		super(name);
	}

	public void run() {

		if (rt.tryLock()) {
			System.out.println(Thread.currentThread().getName()	+ "...got lock and perfoming safe operation");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				rt.unlock();
			}
		} else {
			System.out.println(Thread.currentThread().getName()	+ "...unable to got lock and perfoming alternate operation");
		}
	}
}

class DisplayLockTryLoop extends Thread {
	static ReentrantLock rt = new ReentrantLock(); // lock should be unique

	public DisplayLockTryLoop(String name) {
		super(name);
	}

	public void run() {

		do{
			try{
				System.out.println("Trying ");
				if (rt.tryLock(200,TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()	+ "...got lock and perfoming safe operation");
					Thread.sleep(2000);
					rt.unlock();
					System.out.println(Thread.currentThread().getName()	+ "...Releases lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName()	+ "...unable to got lock and perfoming alternate operation");
				}
			}catch(Exception e){
				System.out.println("Thread got interrupted");
			}
		}while(true);
	}
}