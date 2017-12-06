package in.org.subh.shunya.one;

import java.io.IOException;
import java.util.Collection;
import java.util.StringTokenizer;

public class CodeTest1 {
	
	void reltioCode() {
		String str = "Fortune Cookie1 " + "% " + "Fortune Cookie 2 " + "% " 	+ "Fortune Cookie N";
		
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreElements()) {
			String s = st.nextToken("%");
			System.out.println(s);
			
			StringBuffer sb;
			StringBuilder sbb;
		}
		
		Collection c;
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("hello");

		
	}  
}
