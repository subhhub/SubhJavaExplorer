package org.subh.shunya;

/**
 * @author esubkew
 * 
 * in waiting print 1, 2
 *
 */
public class ThreadSynchronizationTest1 {

	public static void main(String[] args) {

		System.out.println(" 1 ");
		
		synchronized(args){
			System.out.println(" 2 ");
			
			try{
				args.wait();
			} catch(InterruptedException e)	{}
			
		}
		System.out.println(" 3 ");
	}

}
