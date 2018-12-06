package org.subh.shunya;

public class InnerClassMethodLocal {

	public static void main(String[] args) {
		System.out.println("Inner Class Normal Method Local ");
		
		new InnerClassMethodLocal().innerLight();
	}
	
	int x= 10;
	static int y = 20;
	public void innerLight(){
		int xx = 30;			//cant access inside inner classes
		final int xxx = 30;			//can access
		System.out.println("innerLight method");
		
		class MethodInner{
			public void sum(int a, int b){
				System.out.println("InnerClassMethodLocal innerLight innMethod method "+ a+b);
//				System.out.println(xx);			//CE. Only final variable can be accessed from method.
				System.out.println(xxx);			
				System.out.println(x);
				System.out.println(y);
			}
		}
		MethodInner mi = new MethodInner(); 
		mi.sum(13,42);
	}
}
