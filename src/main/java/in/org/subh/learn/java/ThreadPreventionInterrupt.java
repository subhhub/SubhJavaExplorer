package in.org.subh.learn.java;

public class ThreadPreventionInterrupt {

	public static void main(String[] args) {
		System.out.println("Thread Interupttion Start");
		
		//Interrupt child thread
		ThreadI1 t1 = new ThreadI1();
		t1.start();
		t1.interrupt();			//Interruption will be called it thread in waiting stage.
		
		/*for (int i = 0; i < 5; i++) {
			System.out.println("ThreadPreventionInterrupt "+i);
		}*/
		
		//Interrupt Main thread
		/*Thread.currentThread().interrupt();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Main Thread got interrupted");
		}*/
		
		System.out.println("Thread Interupttion End");
	}
}

class ThreadI1 extends Thread{

	public void run() {
		
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println("ThreadJ-1 "+i);
					sleep(100);
				}
			} catch (Exception e) {
				System.out.println("Thread got interrupted "+e);
			}
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread got interrupted - 2");
			}*/
	}
}
