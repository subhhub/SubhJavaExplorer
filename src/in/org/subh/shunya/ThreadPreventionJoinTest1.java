package in.org.subh.shunya;

/**
 * @author esubkew
 * 
 * Deadlock
 *
 */
public class ThreadPreventionJoinTest1 {

	public static void main(String[] args) throws InterruptedException {

		Thread.currentThread().setName("Master");
		
		Thread t = new T1();
		t.start();
		
		Thread.currentThread().join();
		System.out.println(Thread.currentThread().getName());
		
	}
}


class T1 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}