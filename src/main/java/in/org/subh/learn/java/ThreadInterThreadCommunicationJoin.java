package in.org.subh.learn.java;

public class ThreadInterThreadCommunicationJoin {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inter Thread Communication ");
	
		ThreadITC1 itc = new ThreadITC1();
		itc.start();
		Thread.sleep(1000);
		itc.join(); 
		System.out.println("Totacl "+itc.total);
	}
}

class ThreadITC1 extends Thread{

	int total = 0;
	public void run() {
		System.out.println("Child Thread Start");
		for (int i = 0; i < 100; i++) {
			total = total+i;
			System.out.println("total "+total);
		}
		System.out.println("Child Thread End");
	}
}

