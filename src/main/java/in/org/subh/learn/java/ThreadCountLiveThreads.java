package in.org.subh.learn.java;

import java.util.Set;

public class ThreadCountLiveThreads {

	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		LT1 t1 = new LT1();
		LT2 t2 = new LT2();
		t1.start();
		t2.start();
		
//		getAllStackTraces(); Returns a map of stack traces for all live threads.
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		
//		To convert it to an array:
		Thread[] threadArray = threadSet.toArray(new Thread[threadSet.size()]);
		
		System.out.println("Thread trace======> "+Thread.getAllStackTraces());
		System.out.println("all the thread count======> "+ threadArray.length);
		System.out.println("An estimate of the number of active threads in the current thread's thread group======> "+Thread.activeCount());
		
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i] + " "+threadArray[i].getId() + " "+threadArray[i].getState()+ " "+threadArray[i].getPriority());
		}
		
	}
}

class LT1 extends Thread {
	public void run() {
		new LTDummy().printTable(1);
	}
}
class LT2 extends Thread {
	public void run() {
		new LTDummy().printTable(1);
	}
}

class LTDummy{
	synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}
