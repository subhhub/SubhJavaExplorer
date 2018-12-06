package org.subh.shunya;

public class StaticInstanceBlock {

	
	static{
		System.out.println("X");
	}
	
	{
		System.out.println("A");
	}
	
	static{
		System.out.println("Y");
	}
	
	{
		System.out.println("B");
	}
	
	static{
		System.out.println("Z");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

//		StaticInstanceBlock ct = new StaticInstanceBlock();	//load both static and load
		
		// or
		
		Class.forName("in.org.subh.shunya.StaticInstanceBlock");	//load the only static block

		// or
		
		Class.forName("in.org.subh.shunya.StaticInstanceBlock").newInstance();	//load both static and load
	}

}
