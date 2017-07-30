package in.org.subh.shunya;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadInterThreadCommunicationPC4 {
	
	public static void main(String[] args) {

		ProdCons pc = new ProdCons();
		
		ProdThread pt = new ProdThread(pc);
		ConsumeThread ct = new ConsumeThread(pc);
		
		pt.start();
		ct.start();
	}

}

class ProdThread extends Thread{
	ProdCons pc;
	public ProdThread(ProdCons pc) {
		this.pc = pc;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			pc.prod();
			try {
				sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}
class ConsumeThread extends Thread{
	ProdCons pc;
	public ConsumeThread(ProdCons pc) {
		this.pc = pc;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			pc.consum();
			try {
				sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}	

class ProdCons{
	
	ReentrantLock rl = new ReentrantLock();
	ReentrantLock rl2 = new ReentrantLock();
	
	int sv = 10;
	boolean flg = false;
	void prod(){
//	synchronized void prod(){		//lock using synchronized method

//		rl.lock();
		synchronized(this){			//lock using synchronized block
			if(flg){	
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("IE");
				}
			}
			sv++;
			System.out.println("Produced "+sv);
			flg = true;
			notify();
		}
//		rl.unlock();
	}
	void consum(){
//	synchronized void consum(){		//lock using synchronized method

//		rl2.lock();		
		synchronized(this){		//lock using synchronized block
			if(!flg){	
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("IE");
				}
			}
			System.out.println("Consumed "+sv);
			flg = false;
			notify();
		}
//		rl2.unlock();
	}
}