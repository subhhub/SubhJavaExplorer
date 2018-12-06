package org.subh.shunya;

public class ThreadInterThreadCommunicationPC2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("ThreadDiscovery Main");

		Subscriber sb = new Subscriber();
		
		SubsCounterThread cf = new SubsCounterThread(sb,15);
		SubsReportThread rt = new SubsReportThread(sb,15);
		rt.start();
		cf.start();
		
		System.out.println("Main End");
	}
}

class SubsCounterThread extends Thread{

	Subscriber sb;
	int threadCall;
	public SubsCounterThread(Subscriber sb, int threadCall) {
		this.sb = sb;
		this.threadCall = threadCall;
	}
	public void run(){
		for (int i = 0; i <threadCall; i++) {
			sb.subsCount(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Producer got interrupted");
			}
		}
	}
}
class SubsReportThread extends Thread{

	Subscriber sb;
	int threadCall;
	public SubsReportThread(Subscriber sb, int threadCall) {
		this.sb = sb;
		this.threadCall = threadCall;
	}
	public void run(){
		for (int i = 0; i <threadCall; i++) {
			sb.subsReport();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Producer got interrupted");
			}
		}
	}
}

class Subscriber {
	
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