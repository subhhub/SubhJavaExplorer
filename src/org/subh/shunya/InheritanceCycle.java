package org.subh.shunya;

//public class InheritanceCycle extends  InheritanceCycle{	//Cycle detected: the type InheritanceSelf cannot extend/implement itself or one of its own member types
public class InheritanceCycle{

	public static void main(String[] args) {
		System.out.println("InheritanceSelf ");

	}
}

/*class ClassA extends ClassB{
	
}
class ClassB extends ClassA{	//Cycle detected: a cycle exists in the type hierarchy between ClassB and ClassA
	
}*/