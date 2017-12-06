package in.org.subh.shunya.one;

import java.io.IOException;
import java.util.Arrays;

class CodeTest2 extends Thread {

	// static final List al = new ArrayList();// creating arraylist

	public static void main(String[] args) throws IOException {

		String fstr= new String("Javatutorials");
		String sstr= new String("Javatutorials");
		StringBuffer fstr1= new StringBuffer("Javatutorials");
		StringBuffer sstr1= new StringBuffer("Javatutorials");
		System.out.println(fstr==sstr);	//false
		System.out.println(fstr.equals(sstr));	//true	
		System.out.println(fstr1==sstr1);	//false
		System.out.println(fstr1.equals(sstr1));	//false
//		System.out.println(fstr==sstr1);	 //CE: Incompatible need same type of reference. Need some relation
		System.out.println(fstr.equals(sstr1));	//false		
		System.out.println(fstr1==null);		//always false for any kind of object
		System.out.println(fstr.equals(null)); 	//always false for any kind of object


	}
	
}
