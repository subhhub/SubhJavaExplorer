package in.org.subh.shunya;

import java.util.Iterator;

import org.apache.log4j.Logger;

public class C8RunnableImplementation {

	static final Logger logger = Logger.getLogger(C8RunnableImplementation.class);
	
	public static void main(String[] args) {
		
		logger.info("Hello Java 8 Method Reference for Runnable");
		
		//Traditional Approach 1
		Runnable r = new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			}
		};
//		Thread t = new Thread(r);
//		t.start(); 
		
		
		//Lembda Approach 2
		Runnable r1 = () -> {
						for (int i = 0; i < 10; i++) {
							System.out.println(i);
						}
					};
//		Thread t1 = new Thread(r);
//		t1.start(); 
		
					
		//Method Reference Approach	3		
		C8RunnableImplementation ri = new C8RunnableImplementation();				
		Runnable r2 = ri::m1;		//Already avaible method implementation reuseing(argument must be same). Code Reusability
		Thread t1 = new Thread(r2);
		t1.start(); 
	}
	
	public void m1(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

