package in.org.subh.learn.java;

public class ThreadPreventionJoinDeadlock {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(" Main Thread Deadlock");
		Thread.currentThread().join();
	}
	
}
