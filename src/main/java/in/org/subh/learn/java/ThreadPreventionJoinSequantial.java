package in.org.subh.learn.java;

public class ThreadPreventionJoinSequantial {

	public static void main(String[] args) {
		
		ThreadOne tg1 = new ThreadOne();
		tg1.start();
		ThreadTwo tg2 = new ThreadTwo(tg1);
		tg2.start();
		ThreadThree tg3 = new ThreadThree(tg2);
		tg3.start();
	}
}

class ThreadOne extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread One-1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadTwo extends Thread{
	
	ThreadOne to;
	
	public ThreadTwo(ThreadOne tt) {
		
		this.to = tt;
	}
	
	@Override
	public void run() {
		
		try {
			to.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Second-2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadThree extends Thread{
	
	ThreadTwo to;

	public ThreadThree(ThreadTwo tt) {
		
		this.to = tt;
	}
	
	@Override
	public void run() {
		
		try {
			to.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Three-3");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}