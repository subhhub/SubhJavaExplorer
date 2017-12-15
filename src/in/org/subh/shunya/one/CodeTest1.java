package in.org.subh.shunya.one;

import java.io.IOException;
import java.util.Arrays;
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
		
		
		int vl[] = {3,5,2,7,8,1};
		
		vl[1] = vl[1] + vl[2];
		vl[2] = vl[1] - vl[2];
		vl[1] = vl[1] - vl[2];
		
		for(int i = 0; i<vl.length; i++)
			System.out.print(vl[i]+" ");
	}
	
	
	public static void main(String[] args) throws IOException {
		
		/*A a = new B();
		C b = (C)a;
		a.m1();
		b.m1();*/
	}  
}

class A{
	
	void m1(){
		System.out.println("A");
	}
}
class B extends A{
	
	void m1(){
		System.out.println("B");
	}
}
class C extends B{

	void m1(){
		System.out.println("C");
	}
}


