package org.subh.shunya.ocjp6;


	class SuperCalc {
		protected int multiply(int a, int b) { return a * b;}
		}
		class SubCalc extends SuperCalc{
		public int multiply(int a, int b) {
		int c = multiply(a, b);
		return c;
		}
		}

public class Question260 {

	
		SubCalc sc = new SubCalc ();
		System.out.println(sc.multiply(3,4));
		System.out.println(SubCalc.multiply(2,2));
}
