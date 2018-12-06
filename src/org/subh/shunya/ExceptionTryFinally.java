package org.subh.shunya;

import java.io.IOException;

public class ExceptionTryFinally {

	public static void main(String[] args) {
		System.out.println("Exception Try Finally Main");
		
		int rs = new ExceptionTryFinally().doTheWork();
		System.out.println(rs);

//		int rs = new ExceptionTryFinally().doTheWork7();
//		System.out.println(rs);
		
	}

	public int doTheWork() {
		try {
			System.out.println("Before Exception ");
//			int vl = 10/0;
//			throw new NullPointerException();
//			System.out.println("After Exception ");
			return 2;
		} catch (ArithmeticException e) {
			System.out.println("Exception "+e);
			return 3;
		} catch (NullPointerException e) {
			System.out.println("Exception "+e);
			return 4;
		}finally{
			System.out.println("All done");
			/*try {
				int vl = 10/0;
			} catch (Exception e) {
				System.out.println("hello math");
			}*/
			return 5;
		}
//		return 1;
	}
	
	public int doTheWork7() {
		try {
			System.out.println("Before Exception ");
//			int vl = 10/0;
//			throw new NullPointerException();
//			System.out.println("After Exception ");
			return 2;
		} /*catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exception "+e);
			return 3;
		}*/ finally{
			System.out.println("All done");
			try {
				int vl = 10/0;
			} catch (Exception e) {
				System.out.println("hello math");
			}
			return 5;
		}
//		return 1;
	}
	
	public void test1(){
		/*try{
			
			throw new NullPointerException();
		}
		catch(IOException e){			//CE: Unreachable catch block for IOException. This exception is never thrown from the try statement body
			System.out.println("hello");
		}*/
	}
}
