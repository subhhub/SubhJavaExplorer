package in.org.subh.learn.java;

/**
 * @author esubkew
 * 
 * This thread program will count the all numbers and finally print
 *
 */
public class ThreadInterThreadCommunicationPC3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("ThreadDiscovery Main");

		Subscriber2 sb = new Subscriber2();
		
		SubsCounterThread1 cf = new SubsCounterThread1(sb,15);
		SubsReportThread2 rt = new SubsReportThread2(sb);
		cf.start();
		rt.start();
		
		System.out.println("Main End");
	}
}

class SubsCounterThread1 extends Thread{

	Subscriber2 sb;
	int threadCall;
	public SubsCounterThread1(Subscriber2 sb, int threadCall) {
		this.sb = sb;
		this.threadCall = threadCall;
	}
	public void run(){
		int j = 0;
		for (int i = 0; i <threadCall; i++) {
			j = j+i;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Producer got interrupted");
		}
		sb.subsCount(j);
	}
}
class SubsReportThread2 extends Thread{

	Subscriber2 sb;
	public SubsReportThread2(Subscriber2 sb) {
		this.sb = sb;
	}
	public void run(){
			sb.subsReport();
	}
}

class Subscriber2 {
	
	int j = 0;
	boolean isReport = false;

	synchronized void subsCount(int j){	
		if(isReport){
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Producer engine interrupted");
			}
		}
		isReport = true;
		this.j = j;
		System.out.println("## Subscriber Count Produced ##"+j);
		this.notify();
	}
	
	synchronized void subsReport(){
		if(isReport==false){
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Producer engine interrupted");
			}
		}
		isReport = false;
		System.out.println("## Subscriber Report ## "+j);
		this.notify();
	}
}
