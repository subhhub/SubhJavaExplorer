package org.subh.shunya;

public class VarargsTest {
//	final int a;		//Must have to initialize in 1.6 onward. Compile time error
	
	static void display(String... values) {
		System.out.println("display method invoked ");
	}
	
	/*static void display(String[] values) {
		System.out.println("display method invoked ");
	}*/
	/*static void display(int[] values) {
		System.out.println("display integer method invoked ");
	}*/

	public static void main(String args[]) {

		//Array arguments declaration
		display(new String[]{});// zero argument
		display(new String[]{"my", "name", "is", "varargs"});// four arguments
		
		//Array arguments declaration
		display();// zero argument
		display("my", "name", "is", "varargs");// four arguments
	
//		System.out.println(null);	//compile time error
	}
}
