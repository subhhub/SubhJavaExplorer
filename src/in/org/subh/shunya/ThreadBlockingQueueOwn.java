package in.org.subh.shunya;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.*;

public class ThreadBlockingQueueOwn<E> {
	private List queue = new LinkedList();
	private final int size;
	Lock lock = new ReentrantLock();

	public ThreadBlockingQueueOwn(final int size) {
		this.size = size;
	}

	public synchronized boolean offer(E element) {
		// lock.lock();
		while (this.queue.size() == this.size) {
			try {
				wait();
			} catch (InterruptedException ex) {

			}
		}
		if (this.queue.size() == 0) {
			notifyAll();
		}
		boolean status = this.queue.add(element);
		// lock.unlock();
		return status;

	}

	public synchronized E poll() {
		// lock.lock();
		while (this.queue.size() == 0) {
			try {
				wait();
			} catch (InterruptedException ex) {

			}
		}
		if (this.queue.size() == this.size) {
			notifyAll();
		}

		// lock.unlock();
		return (E) this.queue.remove(0);
	}

	public static void main(String[] args) {
		
		ThreadBlockingQueueOwn<String> blockingQueue = new ThreadBlockingQueueOwn<String>(10);

		// BlockingQueue<String> blockingQueue=new ArrayBlockingQueue<String>(10);

		TBProducer producer = new TBProducer(blockingQueue);
		TBConsumer consumer = new TBConsumer(blockingQueue);
		
		// starting producer to produce messages in queue
		new Thread(producer).start();
		
		// starting consumer to consume messages from queue
		try {
			Thread.sleep(10);
		} catch (InterruptedException exd) {
			exd.toString();
		}
		new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");

	}
}

class Message {
	private String msg;

	public Message(String str) {
		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}
}

class TBProducer implements Runnable {
	// change with BlockingQueue when works with java doc implementation of ArrayBlockingQueue
	private ThreadBlockingQueueOwn<String> queue;

	// change the argument with BlockingQueue when works with java doc implementation of ArrayBlockingQueue
	public TBProducer(ThreadBlockingQueueOwn<String> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		// produce messages
		for (int i = 10; i > 0; i--) {
			// Message msg = new Message(""+i);
			try {
				Thread.sleep(i);
				queue.offer(String.valueOf(i));
				System.out.println("Produced " + String.valueOf(i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class TBConsumer implements Runnable {
	// change with BlockingQueue when works with java doc implementation of ArrayBlockingQueue
	private ThreadBlockingQueueOwn<String> queue;

	// change the argument with BlockingQueue when works with java doc implementation of ArrayBlockingQueue
	public TBConsumer(ThreadBlockingQueueOwn<String> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		try {

			// consuming messages until exit message is received
			for (int i = 10; i > 0; i--) {
				Object data = queue.poll();
				if (data != null) {
					Thread.sleep(i);
					System.out.println("Consumed " + data.toString());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}