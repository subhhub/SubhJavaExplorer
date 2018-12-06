package org.subh.shunya;

public class ThreadDeadLock {

	void m1() {
		System.out.println(" m1 :");
		synchronized (ThreadDeadLock.class) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		synchronized (String.class) {
		}

	}

	void m2() {
		System.out.println(" m2 :");
		synchronized (String.class) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		synchronized (ThreadDeadLock.class) {
		}
	}

	public static void main(String[] args) {
		ThreadDeadLock b1 = new ThreadDeadLock();
		b1.m1();
		b1.m2();
	}
}