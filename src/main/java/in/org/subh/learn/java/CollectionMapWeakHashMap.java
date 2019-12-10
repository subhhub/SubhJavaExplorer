package in.org.subh.learn.java;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CollectionMapWeakHashMap {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Collection Map WeakHashMap Main");

		hashMapTest();
		weakHashMapTest();
	}
	
	static void weakHashMapTest() throws InterruptedException{
		WeakHashMap m = new WeakHashMap();
	    Demo d = new Demo();
	         
	    // puts an entry into WeakHashMap
	    m.put(d," Hi "); 
	    System.out.println(m);
	         
	    d = null;
	         
	    // garbage collector is called
	    System.gc(); 
	         
	    // thread sleeps for 4 sec
	    Thread.sleep(4000);
	         
	    System.out.println(m);
	}
	
	static void hashMapTest() throws InterruptedException{
		
		HashMap m = new HashMap();
        Demo d = new Demo();
         
        // puts an entry into HashMap
        m.put(d," Hi "); 
         
        System.out.println(m); 
        d = null;				//whenever key becomes null then corresponding object automatically gc.
         
        // garbage collector is called
        System.gc();
         
        //thread sleeps for 4 sec
        Thread.sleep(4000); 
         
        System.out.println(m);
        }
}

class Demo {
    public String toString() {
        return "demo";
    }
     
    // finalize method
    public void finalize() {
        System.out.println("Finalize method is called");
    }
}