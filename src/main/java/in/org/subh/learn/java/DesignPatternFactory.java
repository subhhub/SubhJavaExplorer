package in.org.subh.learn.java;

public class DesignPatternFactory {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		StarterFactory sf = new StarterFactory();
		InCompleteStarter st = sf.getStarter("TestA");
		System.out.println("st "+st);
		
	}
}

interface Starter{
	
	public void show();
	
}
abstract class InCompleteStarter{
	
	abstract void objectCreator1();
	
	void objectCreator(){
		System.out.println("Object Creator method ");
	}
	void objectCreator(String anme){
		System.out.println("Object Creator method ");
	}
}
//class TestA implements Starter{
class TestA  extends InCompleteStarter{
	
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
class TestB   extends InCompleteStarter{
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
class TestC  extends InCompleteStarter{
	
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

class StarterFactory{
	private int vl = 10;
	
//	Starter getStarter(String name){
	InCompleteStarter getStarter(String name){
		
		if(name.equalsIgnoreCase("TestA")){
			return new TestA();
		}
		else if(name.equalsIgnoreCase("TestB")){
			return new TestB();
		}
		else if(name.equalsIgnoreCase("TestC")){
			return new TestC();
		}
		return null;
	}
	
}

