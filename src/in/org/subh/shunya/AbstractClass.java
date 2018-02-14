package in.org.subh.shunya;

import java.io.IOException;

public class AbstractClass {

	public static void main(String[] args) {
		
	}
	
}

abstract interface AbsInter{
	abstract void methodA()throws IOException;
}
interface AbsInterSub extends AbsInter{
	abstract void methodA()throws IOException;
}


abstract class AbsClass {
	abstract void soundOfAnimal(); // It is just an idea
	abstract void m1();
//	void m2();			//CE: change to abstract
	
//	abstract final void print1();	//CE:
//	final void print2();	//CE:
//	abstract static void print2();	//CE:
//	public abstract static void print3();	//CE: The abstract method print3 in type AbsClass can only set a visibility modifier, one of public or protected
}

abstract class AbsClassA extends AbsClass {
	void soundOfAnimal() {
		System.out.println("Meoh"); 
		// Implementation of the idea according to requirements of sub class
	}
}

abstract class AbsClassB extends AbsClass {
	void soundOfAnimal() {
		System.out.println("Bow Bow");
		// Implementation of the idea according to requirements of sub class
	}
}

abstract class AbsClassD{
	
}

class AbsClassG{
	
}

abstract class AbsClassE{
	
//	private abstract void AbsClassE();   //Compile time error, abstract method can not be private.
	
//	static abstract void AbsClassE();   //Compile time error, abstract method can not be static. (Only public and protected)
	
	/*abstract AbsClassE(){			//ompile time error
	}
	*/
	public AbsClassE() {
	}
}

abstract class AbsClassF{
	
//	abstract public AbsClassF() {}	//Illegal modifier for the constructor in type AbsClassF; only public, protected & private are permitted
	
	
	class A{
		
	}
	
	abstract class B{
		
	}
}



