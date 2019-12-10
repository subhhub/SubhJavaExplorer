package in.org.subh.learn.java;

import java.io.IOException;

public class InheritanceReference {

	public static void main(String[] args) throws IOException {
			
		AR a = new BR();
		CR b = (CR)a;			//RE:  ClassCastException: B cannot be cast to C. Means child can't cast to parent
//		a.m1();
//		b.m1();
		
		CR c = new CR();
		BR b1 = c;
		AR a1 = c;
		AR a2 = b1;
		
		b1.m1();
		a1.m1();
		a2.m1();
	}  
}

class AR{
	
	void m1(){
		System.out.println("A");
	}
}
class BR extends AR{
	
	void m1(){
		System.out.println("B1");
	}
	
	void m2(){
		System.out.println("B2");
	}
}
class CR extends BR{

	void m1(){
		System.out.println("C1");
	}
	
	void m2(){
		System.out.println("C2");
	}
	
	void m3(){
		System.out.println("C3");
	}
}