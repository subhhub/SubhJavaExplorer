package org.subh.shunya.ocjp6;

public class Question31 {

	public static void main(String[] args) {
		DD e = new EE();
		e.bMethod();
	}
	
}

interface AA { public void aMethod(); }
interface BB { public void bMethod(); }
interface CC extends AA,BB { public void cMethod(); }
class DD implements BB{
	public void bMethod() {
		System.out.println("DD: bMethod");
	}
}
class EE extends DD implements CC{

	public void bMethod() {
		System.out.println("EE: bMethod");
	}
	
	public void aMethod() {
		System.out.println("EE: aMethod");
		
	}

	public void cMethod() {
		System.out.println("EE: cMethod");
	}
	
}