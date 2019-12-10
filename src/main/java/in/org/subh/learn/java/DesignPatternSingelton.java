package in.org.subh.learn.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DesignPatternSingelton {

	public static void main(String[] args) {
		System.out.println("Singelton Test");
		
		/*SingelObjectEarly so = SingelObjectEarly.getSingleObject();
//		SingelObject so = new SingelObject();
		System.out.println("so "+so.hashCode());
		SingelObjectEarly so1 = SingelObjectEarly.getSingleObject();
//		SingelObject so1 = new SingelObject();
		System.out.println("so1 "+so1.hashCode());
		so.show();*/
		
		SingelObjectLazy so = SingelObjectLazy.getSingleObject();
		System.out.println("so "+so.hashCode());
		SingelObjectLazy so1 = SingelObjectLazy.getSingleObject();
		System.out.println("so1 "+so1.hashCode());
		so.show();
	}
}

class SingelObjectEarly{

	private  SingelObjectEarly() {
	}
	
	private static SingelObjectEarly so = new SingelObjectEarly();
	
	public static SingelObjectEarly getSingleObject(){
		return so;
	}
	
	void show(){
		System.out.println("I am inside Early singelton");
	}
}

class SingelObjectLazy{

	private  SingelObjectLazy() {
	}
	
	private static SingelObjectLazy so = null;
	
	static Lock l = new ReentrantLock();
	
	public static SingelObjectLazy getSingleObject(){
		if(so == null){
			l.lock();
//			synchronized(SingelObjectLazy.class){
				if(so == null)
					so = new SingelObjectLazy();
//			}
			l.unlock();
		}
		return so;
	}
	
	void show(){
		System.out.println("I am inside Lazy singelton");
	}
}