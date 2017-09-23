package in.org.subh.shunya.one;

import java.io.IOException;
import java.util.Arrays;

public class CodeTest2 extends Thread {

	// static final List al = new ArrayList();// creating arraylist

	public static void main(String[] args) throws IOException {

		int[] iArray = new int[] {101,102,103,104,105}; 
		System.out.println(Arrays.toString(iArray));

		String str = "subhash";
		
		 CodeTest2 ct = new  CodeTest2();
		 String vl = ct.recur(str);
		System.out.println(vl);
	}
	
	String str1 = "";
	String recur(String str){
		
		
		if(str.length()>1){
			str1 = str1 + str.substring(str.length()-1,	str.length());
//			str = str.substring(0, str.length()-1);
		}
		else
			return str1;
		
		
		return recur(str.substring(0, str.length()-1));
	}
}


class TC1 extends Thread {
	Calculator c;

	public TC1(Calculator c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.add();
	}
}

class TC2 extends Thread {
	Calculator c;

	public TC2(Calculator c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.add();
	}
}

class Calculator {

	static int j = 1;
	int i = 1;

	public void add() {
		System.out.println(++i);
	}

	public void calculate() {
		System.out.println(j++);
	}
	
	
}

class MQ {

	int ar[] = new int[5];
	int limit = 5;
	int sz = -1;

	public void put(int v) {

		if (ar.length == limit)
			System.out.println("Q is full");
		else {
			sz = sz + 1;
			ar[sz] = v;
		}

	}

	public int get() {

		int vl = 0;

		if (ar.length == 0)
			System.out.println("Q is Emplty");
		else {
			vl = ar[0];

			for (int i = 1; i < sz; i++) {
				ar[i - 1] = ar[i];
			}

			sz = sz - 1;
		}

		return limit;
	}

}