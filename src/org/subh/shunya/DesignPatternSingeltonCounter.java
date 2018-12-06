package org.subh.shunya;

import in.org.subh.shunya.one.CommonClass;

public class DesignPatternSingeltonCounter {

	private static DesignPatternSingeltonCounter instance = new DesignPatternSingeltonCounter();

	public int counter = 0;

	// This private constructor is to prevent this object get instantiated more
	// than once.
	private DesignPatternSingeltonCounter() {
	}

	public static DesignPatternSingeltonCounter getInstance() {
		return instance;
	}

	public void increment() {
		this.counter++;
	}

	public static void main(String args[]) {
		DesignPatternSingeltonCounter s = DesignPatternSingeltonCounter.getInstance();
		s.increment();
		s.increment();
		s.increment();
		System.out.println(s.counter); // 3

		DesignPatternSingeltonCounter s2 = DesignPatternSingeltonCounter.getInstance();
		System.out.println(s2.counter); // 3 also, because s2 is the same
										// instance as s, just two different
										// variable pointing to the same
										// instance

	}
}
