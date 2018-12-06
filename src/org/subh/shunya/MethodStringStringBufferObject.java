package org.subh.shunya;


public class MethodStringStringBufferObject {

	public static void main(String[] args) {

		new MethodStringStringBufferObject().m1(null);
	}

	void m1(String s) {

		System.out.println("sssss" + s);
	}

	/*void m1(StringBuffer s) {

		System.out.println("sssss" + s);
	}*/

	void m1(Object sb) {

		System.out.println("WWWWWWWWWWWWWWWW" + sb);

	}

}
