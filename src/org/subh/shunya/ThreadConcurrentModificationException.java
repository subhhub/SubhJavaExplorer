package org.subh.shunya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadConcurrentModificationException extends Thread {

	/*static List al = new ArrayList();

	@Override
	public void run() {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Updating list");
		al.add("Value-5");
	}*/

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread Concurrent Modification Exception Main");

		/*al.add("Value-1");
		al.add("Value-2");
		al.add("Value-3");
		al.add("Value-4");
		ThreadConcurrentModificationException cme = new ThreadConcurrentModificationException();
		cme.start();
		Iterator it = al.iterator();
		while (it.hasNext()) {
			String vl = (String) it.next();
			System.out.println("Main thread iterating list and current object is " + vl);

			Thread.sleep(200);
		}
		System.out.println("al " + al);*/
		
		List al = new ArrayList();				//RE ConcurrentModificationException
//		List al = new CopyOnWriteArrayList();	//run smootyly without any array.	
//		Collections.synchronizedList(al);
		
		ConcurThreadModi cm = new ConcurThreadModi(al);
		ConcurThreadRead cr = new ConcurThreadRead(al);
		cm.start();
		cr.start();
	}

}

class ConcurThreadModi extends Thread {			//Modification thread, while modifying it will throw ConcurrentModificationException
	List al;

	public ConcurThreadModi(List al) {
		this.al = al;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Updating list");
		al.add("Value-5");
	}
}
class ConcurThreadRead extends Thread {			//Reader thread
	List al;
	
	public ConcurThreadRead(List al) {
		this.al = al;
	}
	
	@Override
	public void run() {
		
		/*synchronized(this){
			
		}*/
		al.add("Value-1");
		al.add("Value-2");
		al.add("Value-3");
		al.add("Value-4");

		Iterator it = al.iterator();
		while (it.hasNext()) {
			String vl = (String) it.next();
			System.out.println("Read thread iterating list and current object is " + vl);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("al " + al);
	}
}