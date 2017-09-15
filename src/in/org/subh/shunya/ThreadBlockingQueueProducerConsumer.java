package in.org.subh.shunya;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadBlockingQueueProducerConsumer {

	public static void main(String args[]) {

		// Creating shared object
		BlockingQueue sharedQueue = new LinkedBlockingQueue(3);
//		sharedQueue.add(null);		//NPE

		// Creating Producer and Consumer Thread
		Thread prodThread = new Thread(new Producer(sharedQueue));
		Thread consThread = new Thread(new Consumer(sharedQueue));

		// Starting producer and Consumer thread
		consThread.start();
		prodThread.start();
	}

}

// Producer Class in java
class Producer implements Runnable {

	private final BlockingQueue sharedQueue;

	public Producer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 4; i++) {
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);
				Thread.sleep(300);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}

// Consumer Class in Java
class Consumer implements Runnable {

	private final BlockingQueue sharedQueue;
	int i = 0; 

	public Consumer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
			try {
				//consuming messages until exit message is received
	            while(4>=i){
		            Thread.sleep(100);
	//	            System.out.println("Consumed "+msg.getMsg());
		            System.out.println("Consumed: " + sharedQueue.take());
		            i++;
	            }
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
			}
	}
}