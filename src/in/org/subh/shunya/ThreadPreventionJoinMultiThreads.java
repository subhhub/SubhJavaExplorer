package in.org.subh.shunya;

public class ThreadPreventionJoinMultiThreads {

	public static void  main(String...args){
		
		System.out.println("ThreadPreventionJoinMultiThreads Main");
	
		Thread mt = Thread.currentThread();
		
		ThreadFirst tf = new ThreadFirst(mt);
		tf.start();
//		tf.join();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Main-0");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		ThreadSecond tf1 = new ThreadSecond(tf, mt);		//One thead can join multiple thread
//		tf1.start();
		
		System.out.println("Main End");
	}
}

class ThreadFirst extends Thread{

	Thread t;
	public ThreadFirst(Thread t) {
		System.out.println("Thread ThreadFirst Constructor -1");
		this.t = t;
	}
	
	public void run(){
		/*try {
			t.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}*/
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread First-1 "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadSecond extends Thread{
	Thread t;
	Thread mt;
	public ThreadSecond(Thread t, Thread mt) {
		System.out.println("Thread ThreadSecond Constructor -1");
		this.t = t;
		this.mt = mt;
	}

	public void run(){
		try {
			t.join();
			mt.join();
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
