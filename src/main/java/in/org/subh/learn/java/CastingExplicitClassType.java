package in.org.subh.learn.java;

/**
 * @author esubkew
 * 
 * Narrowing a Class Type
 * 
 * We all know that when we are assigning larger type to a smaller type, then we need to explicitly type cast it. 
 * Lets take the same above code with a slight modification
 *
 */
public class CastingExplicitClassType {

	public static void main(String[] args) {
		
		ParentEx p = new ChildEx();
//		p.disp();
//		ChildEx c = p;				//CE: cannot convert from ParentEx to ChildEx
		ChildEx c = (ChildEx) p;
//		c.disp();
		
		ParentEx p1 = new ParentEx();
//		ChildEx c1 = (ChildEx) p1;		//RE: java.lang.ClassCastException:ParentEx cannot be cast ChildEx
//		c1.disp();		
		
		ChildEx c3 = new ChildEx();
		ParentEx p3 = c3;
		c3.disp();			//Child disp called
		p3.disp();			//Child disp called
	}
}

class ParentEx {
	public void disp() {
		System.out.println("Parent disp called");
	}
}

class ChildEx extends ParentEx {
	public void dispChild() {
		System.out.println("Child dispChild called");
	}
	
	public void disp() {
		System.out.println("Child disp called");
	}
}

class Child1Ex {
	public void dispChild() {
		System.out.println("Child dispChild called");
	}
	
	public void disp() {
		System.out.println("Child disp called");
	}
}
