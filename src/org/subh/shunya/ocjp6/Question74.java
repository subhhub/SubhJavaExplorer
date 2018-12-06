package org.subh.shunya.ocjp6;
class ClassA {
	public int numberOfInstances;

	protected ClassA(int numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}
	
	protected int blipvert(int x) { 
		return 0; 
	}
}

public class Question74 extends ClassA {
	
	private int blipvert(float x) { 
		return 0; 
	}
	
	
	private Question74(int numberOfInstances) {
		super(numberOfInstances);
	}

	public static void main(String[] args) {
		Question74 ext = new Question74(420);
		System.out.print(ext.numberOfInstances);
		
		
		TestPrivate tt = new TestPrivate();
		
		System.out.println(doIt(2,4,5));
	}
	
	static String doIt(int a, int b){
		return "a";
	}
	static String doIt(int...a){
		return "b";
	}
	
}
class TestPrivate{
	TestPrivate() {
		// TODO Auto-generated constructor stub
	}
	private void method(){
		TestPrivate tt = new TestPrivate();
	}
}