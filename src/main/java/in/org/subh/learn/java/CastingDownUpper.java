package in.org.subh.learn.java;

public class CastingDownUpper {

	public static void main(String[] args) {
		
		Abc a = new Xyz1();
		a.display();
		System.out.println(" a "+a.hashCode());
		
		Xyz x = new Xyz1();
		System.out.println(" a "+x.hashCode());
		x.display();
		
	}
	
}

interface Abc{
	
	void display();
}
interface Abc1{
	
	void display();
}

class Xyz implements Abc, Abc1{

	private int a = 10;
	public void display() {
		System.out.println("Class Xyz implented Abc");
	}
	
	void display1(){
		System.out.println("I am private of Class Xyz");
	}
}

class Xyz1 extends Xyz{
	
	public void display() {
		System.out.println("Class Xyz1 extends Xyz");
	}
	
	void display1(){
		System.out.println("I am private of Class Xyz1 Overriden");
	}
}


