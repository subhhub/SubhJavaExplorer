package in.org.subh.shunya;

import java.util.Random;

public class ThreadInterThreadCommunicationPC {

	public static void main(String[] args) {
		System.out.println("Producer Consumer Home");
		
		final ProducerConsumer pc = new ProducerConsumer();
		/*Thread p = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					pc.produce();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						System.out.println("Producing Error "+e);
					}
				}
			}
		});*/
		
		/*Thread c = new Thread(new Runnable() {
			public void run() {
				pc.consume();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Producing Error "+e);
				}
			}
		});*/
		
		/*ProducerThread p = new ProducerThread(pc);
		ConsumerThread c = new ConsumerThread(pc);
		p.start();
		c.start();*/
	}
}

class ProducerThread extends Thread{
	ProducerConsumer pc;
	public ProducerThread(ProducerConsumer pc) {
		this.pc = pc;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			pc.produce();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Producing Error "+e);
			}
		}
	}
}

class ConsumerThread extends Thread{
	ProducerConsumer pc;
	public ConsumerThread(ProducerConsumer pc) {
		this.pc = pc;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			pc.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Producing Error "+e);
			}
		}
	}
}


class ProducerConsumer {
	
	Random rm = new Random();
	boolean isProduced = false;
	int val;
	
	public synchronized void produce(){
		if(isProduced){
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Produece Error "+e);
			}
		}
		val = rm.nextInt(10);
		System.out.println("produced value "+val);
		isProduced = true;
		this.notify();
	}
	
	public synchronized void consume(){
		if(!isProduced){
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Consume Error "+e);
			}
		}
		System.out.println("Consumed "+val);
		isProduced = false;
		this.notify();
	}
}