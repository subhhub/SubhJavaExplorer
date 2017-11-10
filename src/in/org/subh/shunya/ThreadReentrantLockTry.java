package in.org.subh.shunya;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

public class ThreadReentrantLockTry {
	
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
	
	static final Logger logger = Logger.getLogger(DisplayLockTry.class);
	
	static ReentrantLock rt = new ReentrantLock(); // lock should be unique

	public DisplayLockTry(String name) {
		super(name);
	}

	@Override
	public void run() {

		if (rt.tryLock()) {
			logger.info(Thread.currentThread().getName()	+ "...got lock and perfoming safe operation");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				rt.unlock();
				
				 Thread.currentThread().interrupt();
			}
		} else {
			logger.info(Thread.currentThread().getName()	+ "...unable to got lock and perfoming alternate operation");
		}
	}
}

class DisplayLockTryLoop extends Thread {
	
	static final Logger logger = Logger.getLogger(DisplayLockTryLoop.class);
	
	static ReentrantLock rt = new ReentrantLock(); // lock should be unique

	public DisplayLockTryLoop(String name) {
		super(name);
	}

	@Override
	public void run() {

		do{
			try{
				logger.info("Trying ");
				if (rt.tryLock(200,TimeUnit.MILLISECONDS)) {
					logger.info(Thread.currentThread().getName()	+ "...got lock and perfoming safe operation");
					Thread.sleep(2000);
					rt.unlock();
					logger.info(Thread.currentThread().getName()	+ "...Releases lock");
					break;
				} else {
					logger.info(Thread.currentThread().getName()	+ "...unable to got lock and perfoming alternate operation");
				}
			}catch(Exception e){
				logger.info("Thread got interrupted");
			}
		}while(true);
	}
}