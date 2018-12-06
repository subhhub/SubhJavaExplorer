package org.subh.shunya.ocjp6;
public class Question35 {

	public static void main(String[] args) {
		Foo31 f = new Bar();
		f.addFive();
		System.out.println(f.a);
		
		
		Foo31 ff = new Foo31();
//		Bar b = (Bar)f;
	}
}

class Foo31 {
	public int a = 3;
	private int b = 30;

	public void addFive() {
		a += 5;
		System.out.print("f ");
	}
}

class Bar extends Foo31 {
	public int a = 8;
	public int ac = 80;

	public void addFive() {
		this.a += 5;
		System.out.print("b ");
	
//		System.out.print("bb "+b);
	}
	
	public void addFastFive() {
		System.out.print("Fast b ");
	}
}