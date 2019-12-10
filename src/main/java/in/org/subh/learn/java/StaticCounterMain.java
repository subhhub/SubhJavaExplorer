package in.org.subh.learn.java;

public class StaticCounterMain {

	public static void main(String[] args) throws InterruptedException {

		/*StaticCounter ct1 = new StaticCounter();			//Using individual object
		ct1.increment();
		StaticCounter ct2 = new StaticCounter();
		ct2.increment();
		StaticCounter ct3 = new StaticCounter();
		ct3.increment();
		StaticCounter ct4 = new StaticCounter();
		ct4.increment();*/
		
		StaticCounter ct1 = StaticCounter.getStaticCounter();			//Using Singleton
		ct1.increment();
		StaticCounter ct2 = StaticCounter.getStaticCounter();
		ct2.increment();
		StaticCounter ct3 = StaticCounter.getStaticCounter();
		ct3.increment();
		StaticCounter ct4 = StaticCounter.getStaticCounter();
		ct4.increment();
		
		/*System.out.println("ct1 "+ct1);
		System.out.println("ct2 "+ct2);
		System.out.println("ct3 "+ct3);
		System.out.println("ct4 "+ct4);*/
		
		System.out.println(ct1.s_inc);			//static variable will be shared by all the objects
		System.out.println(ct4.inc);			//non static variable will not be shared by all the variable
	}
}

/**
 * @author esubkew
 * 
 * In case of singleton output for static and non static variable after increment would be same.
 * In case of indivisual object output for static and non static variable after increment would be different.
 *
 */
class StaticCounter{
	int inc = 0;
	static int s_inc = 0;
	
	private static StaticCounter sc =  new StaticCounter();
	
	/*private StaticCounter(){
		
	}*/
	
	void increment(){
		s_inc++;
		inc++;
	}
	
	static StaticCounter getStaticCounter(){
		return sc;
	}
}