package in.org.subh.shunya;

public class CastingImplicitClassType {

	public static void main(String[] args) {
		Parent p = new Child();
		p.disp();

	}

}

class Parent {
	public void disp() {
		System.out.println("Parent disp called");
	}
}

class Child extends Parent {
	public void dispChild() {
		System.out.println("Child dispChild called");
	}
	
	public void disp() {
		System.out.println("Child disp called");
	}
}