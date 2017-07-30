package in.org.subh.shunya;

import java.util.HashSet;
import java.util.Set;

public class MphasisTest {

	 public static void main(String arg[]){
	        System.out.println("Start Printing");
	        
	        
	        Set st = new HashSet();
			st.add(20);
			st.add("Subhash");		//In case of TreeSet it will throw RE. ClassCastException.
			st.add(null);
			st.add(20);
			st.add(5);
			st.add(null);			//In case of TreeSet it will throw RE. NullPionterException (1.6)
			System.out.println(st);
	    }
}

