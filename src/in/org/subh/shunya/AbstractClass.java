package in.org.subh.shunya;

public class AbstractClass {

	public static void main(String[] args) {
		
	}
	
}

abstract class AbsClass {
	abstract void soundOfAnimal(); // It is just an idea
	abstract void m1();
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



