package in.org.subh.learn.java;

//3. The constructor for the most derived class is invoked.
public class ObjectCreationFlow extends ObjC {
	
	//2. The instance variables of the objects are initialized to their default values.
	int ina;
	String str;
//	final int A;	//The blank final field A may not have been initialized. Constructor will throw CE.
	
	//5. Body of the base constructor is executed. 
	public ObjectCreationFlow() {
		System.out.println("Main Method Constructor");
	}
	
	//4. all instance variable initializers and initialization blocks are executed.
	{
		System.out.println("Independent Block");
	}
	
	//0. Static block execute before the object creation or main method
	static {
		System.out.println("Static Independent Block");
	}
	
	public static void main(String[] args) {
		System.out.println("*********Ojbect Cration Flow************");
		
		//1. Heap Memory creation
		ObjectCreationFlow ocf = new ObjectCreationFlow();
	}

}

class ObjA{
	public ObjA() {
		System.out.println("OA Constructor");
	}
}
class ObjB extends ObjA{
	public ObjB() {
		System.out.println("ObjB Constructor");
	}
}
class ObjC extends ObjB{
	public ObjC() {
		System.out.println("ObjC Constructor");
	}
}
