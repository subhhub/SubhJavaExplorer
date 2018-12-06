package org.subh.shunya;

public class InheritanceBlock {

	static {	//First		//will excuted at the time of class loading
		System.out.println("Inside static");
	}
	
	{			//Second	//will be excuted at the time of object creation
		System.out.println("Inside init");
	}
	
	InheritanceBlock() {	//Third
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		CBlock c = new CBlock();
		
		new InheritanceBlock();
	}
}

class ABlock {
	{
		System.out.println(1);
	}
}

class BBlock extends ABlock {
	{
		System.out.println(2);
	}
}

class CBlock extends BBlock {
	{
		System.out.println(3);
	}
}
