package org.subh.shunya;

public class InheritanceTest {

	public static void main(String[] args) {

		AA a = new AA();
		BB b = new CC();
		CC c = (CC) new AA(); //RE: ClassCastException: AA cannot be cast to CC
		
		
//		a.abc
//		b.abc();
		c.abc();
		
	}
	
}

class AA{
	
	void abc(){
		System.out.println("hello AA");
	}
	
	void abc1(){
		System.out.println("hello abc1");
	}
}
class BB extends AA{
	
	void abc(){
		System.out.println("hello BB");
	}
	
	void abc2(){
		System.out.println("hello abc2");
	}
}
class CC extends BB{
	
	void abc(){
		System.out.println("hello CC");
	}
	
	void abc3(){
		System.out.println("hello abc3");
	}
}