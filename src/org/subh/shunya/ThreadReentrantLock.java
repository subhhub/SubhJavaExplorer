package org.subh.shunya;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadReentrantLock {

	public static void main(String[] args) {
		DisplayLock dl = new DisplayLock();
		
		DisplayThread dt = new DisplayThread(dl, "Subh");
		DisplayThread dt1 = new DisplayThread(dl, "Risa");
		dt1.start();
		dt.start();
	}
}

class DisplayThread extends Thread{

	DisplayLock dl;
	String name;
	DisplayThread(DisplayLock dl, String name){
		this.dl = dl;
		this.name = name;
	}
	public void run() {
			dl.wish(name);
	}
}

class DisplayLock{

	ReentrantLock rt = new ReentrantLock();		//lock should be unique 
	
//	synchronized void wish(String name){			//use synchronized or synchronized block or lock
	void wish(String name){
		rt.lock();
//		synchronized(DisplayLock.class){
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning ");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
//		}
		rt.unlock();
	}
}
