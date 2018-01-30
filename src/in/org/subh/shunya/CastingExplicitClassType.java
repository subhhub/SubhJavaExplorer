package in.org.subh.shunya;

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
		p.disp();
//		ChildEx c = p;				//cannot convert from ParentEx to ChildEx
		ChildEx c = (ChildEx) p;
		c.disp();

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
