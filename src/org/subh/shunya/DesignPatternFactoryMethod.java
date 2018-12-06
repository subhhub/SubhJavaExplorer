package org.subh.shunya;

public class DesignPatternFactoryMethod {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		StarterFactory1 sf = new StarterFactory1();
		InCompleteStarter1 st = sf.getStarter("TestA");
		System.out.println("st "+st);
		
	}
}

interface Starter1{
	
	public void show();
	
}
abstract class InCompleteStarter1{
	
	abstract void objectCreator1();
	
	void objectCreator(){
		System.out.println("Object Creator method ");
	}
	void objectCreator(String anme){
		System.out.println("Object Creator method ");
	}
}
//class TestA implements Starter{
class TestA1  extends InCompleteStarter1{
	
	void show(){
		System.out.println("TestA ");
	}
	public void showA(){
		System.out.println("TestA showA");
	}
	void objectCreator1(){
		System.out.println("Object Creator method1 ");
	}
}
//class TestB implements Starter{
class TestB1   extends InCompleteStarter1{
	void show(){
		System.out.println("TestB ");
	}
	void showB(){
		System.out.println("TestB showB");
	}
	void objectCreator1(){
		System.out.println("Object Creator method1 ");
	}
}	
//class TestC implements Starter{
class TestC1  extends InCompleteStarter1{
	
	void show(){
		System.out.println("TestC ");
	}
	void showC(){
		System.out.println("TestC showC");
	}
	void objectCreator1() {
		System.out.println("Object Creator method1 ");
	}
}

class StarterFactory1{
	private int vl = 10;
	
//	Starter getStarter(String name){
	InCompleteStarter1 getStarter(String name){
		
		if(name.equalsIgnoreCase("TestA")){
			return new TestA1();
		}
		else if(name.equalsIgnoreCase("TestB")){
			return new TestB1();
		}
		else if(name.equalsIgnoreCase("TestC")){
			return new TestC1();
		}
		return null;
	}
	
}

