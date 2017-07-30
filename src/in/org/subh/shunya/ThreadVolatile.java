package in.org.subh.shunya;

import java.util.Scanner;

public class ThreadVolatile {

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.start();

		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		obj.shutdown();
	}
}

// volatile keyword prevents caching of variables. Consider the code ,first
// without volatile keyword

class MyThread extends Thread {
	private boolean running = true; // non-volatile keyword

	public void run() {
		while (running) {
			System.out.println("hello");
		}
	}

	public void shutdown() {
		running = false;
	}
}
