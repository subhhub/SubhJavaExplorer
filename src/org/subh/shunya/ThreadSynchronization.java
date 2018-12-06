package org.subh.shunya;

public class ThreadSynchronization {

	public static void main(String[] args) {

		/*
		 * Display d1 = new Display(); 
		 * Display d2 = new Display(); 
		 * Display d3 = new Display(); 
		 * ThreadDisplay dp = new ThreadDisplay(d1, "Subh");
		 * ThreadDisplay dp1 = new ThreadDisplay(d2, "Subh-1"); 
		 * ThreadDisplay dp2 = new ThreadDisplay(d3, "Subh-2"); 
		 * dp.start(); dp1.start();
		 * dp2.start();
		 */

		/*
		 * Display d1 = new Display(); 
		 * ThreadDisplayChar dp = new ThreadDisplayChar(d1); 
		 * ThreadDisplayNum dp1 = new ThreadDisplayNum(d1); 
		 * ThreadDisplaySep dp2 = new ThreadDisplaySep(d1);
		 */
		// dp.start();
		// dp1.start();
		// dp2.start();

		/*SynchClass sc = new SynchClass();
		ThreadSync ts = new ThreadSync(sc);
		ThreadSync2 ts2 = new ThreadSync2(sc);
		ts.start();
		ts2.start();*/

	}

}

/*class ThreadSync extends Thread {

	SynchClass sc;
	
	public ThreadSync(SynchClass sc) {
		this.sc = sc;
	}
	
	@Override
	public void run() {
		sc.disp1();
	}
}

class ThreadSync2 extends Thread {
	
	SynchClass sc;
	
	public ThreadSync2(SynchClass sc) {
		this.sc = sc;
	}
	
	@Override
	synchronized public void run() {
		sc.disp2();
	}
}

class SynchClass {

	synchronized void disp1() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Thread TS - 1 " + i);
		}
	}

	synchronized void disp2() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Thread TS - 2 " + i);
		}
	}
}*/

class ThreadDisplay extends Thread {

	Display d1;
	String name;

	public ThreadDisplay(Display d1, String name) {
		this.d1 = d1;
		this.name = name;
	}

	public void run() {
		d1.wish(name);
	}
}

class ThreadDisplayChar extends Thread {

	Display d1;
	String name;

	public ThreadDisplayChar(Display d1) {
		this.d1 = d1;
	}

	public void run() {
		d1.displayc();
		;
	}
}

class ThreadDisplayNum extends Thread {

	Display d1;
	String name;

	public ThreadDisplayNum(Display d1) {
		this.d1 = d1;
	}

	public void run() {
		d1.displayn();
		;
	}
}

class ThreadDisplaySep extends Thread {

	Display d1;
	String name;

	public ThreadDisplaySep(Display d1) {
		this.d1 = d1;
	}

	public void run() {
		d1.displays();
		;
	}
}

class Display {

	public synchronized void wish(String name) {
		// public static synchronized void wish(String name){
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

	public static synchronized void displayn() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static synchronized void displayc() {
		for (int i = 65; i < 97; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displays() {
		for (int i = 97; i < 105; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}