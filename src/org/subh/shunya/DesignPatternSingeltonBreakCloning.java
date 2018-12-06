package org.subh.shunya;

//JAVA code to explain cloning 
//issue with singleton
class SuperClass implements Cloneable {
	int i = 10;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

// Singleton class
class SingletonC extends SuperClass {
	// public instance initialized when loading the class
	public static SingletonC instance = new SingletonC();

	private SingletonC() {
		// private constructor
	}
}

public class DesignPatternSingeltonBreakCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonC instance1 = SingletonC.instance;
		SingletonC instance2 = (SingletonC) instance1.clone();
		System.out.println("instance1 hashCode:- " + instance1.hashCode());
		System.out.println("instance2 hashCode:- " + instance2.hashCode());
	}
}