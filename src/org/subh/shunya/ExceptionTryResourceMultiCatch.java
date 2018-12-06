package org.subh.shunya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionTryResourceMultiCatch {

	public static void main(String[] args) {

		System.out.println("### Exception Try with Resource Multiple Catch ##");
		
		
		List<String> ls = new ArrayList<>();
		
		int i = 10/10;
		
		/*try(BufferedReader br = new BufferedReader(new FileReader(new File("uid.txt")))){		//sinlge resource
//		try(BufferedReader br = new BufferedReader(new FileReader(new File("uid.txt"))); 		
//			BufferedReader br2 = new BufferedReader(new FileReader(new File("uid.txt")))){		//Multi resource
			System.out.println("testing Try with resource");
			throw new ClassNotFoundException();
		} catch (IOException | ClassNotFoundException  e) {
			System.out.println("e "+e);
		}
		finally{
			
		}*/
		
		
		/*try{
			System.out.println("heello try");
//			throw new NullPointerException();
		}catch(ArithmeticException e){
			System.out.println("hello catch");
//			System.out.println(10/0);
//			throw new NullPointerException();
//			throw new Error();
		}finally{
			System.out.println("hello finally");
		}*/	
		
//		new ExceptionTest().excep1();
//		new ExceptionTest();			//need to handle exception
	}
	
}
class ExceptionTest{
	public ExceptionTest()throws Exception {
		System.out.println("constructor ExceptionTest");
		System.out.println(10/0);
	}
	
	void excep1() throws Exception{
		System.out.println("heello excep11");
		excep2();
		System.out.println("heello excep12");
	}
	
	void excep2()throws Exception{
		System.out.println("heello excep21");
//		System.out.println(10/0);
		System.out.println("heello excep22");
	}
	
	void excep3() throws Exception{
		
		//Unchecked exception no CE.
		try{
			System.out.println("heello excep31");
		}
		catch(ArithmeticException e){
			System.out.println("heello excep32");
		}
		
		//Checked exception throw CE.
		/*try{
			System.out.println("heello excep311");
		}
		catch(IOException e){
			System.out.println("heello excep322");
		}*/
	}
}

class CustExcep extends Exception{
	
}
