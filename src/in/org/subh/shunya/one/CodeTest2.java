package in.org.subh.shunya.one;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeTest2 extends Thread {

	public static void main(String[] args) throws IOException {

		/*
		 * Calculator cl = new Calculator(); 
		 * TC1 t1 = new TC1(cl); 
		 * TC1 t2 = new TC1(cl); 
		 * t1.start(); 
		 * t2.start();
		 */

		/*String value = "8-0";
		Object type = "PDPCHCP";
		gprsConversion(type, value);*/
		
		String str = "asdwefasw42dasfd0";

		Matcher m = Pattern.compile("[0-9]+$").matcher(str);
		String result  = m.find()?m.group():"";
	
		System.out.println(result);
		
		Map mp = new HashMap();
	}
	

	private static void gprsConversion(Object typeField, String value) {
		
		String rgx = "([0-9]){1}([-])([0-9]{1})";	
		
		if(value!=null && Pattern.matches(rgx, value)){
			System.out.println("Matched");
			
			String nv[] = value.split("-");
			String nvv = null;
			if(!"0".equals(nv[1])){
				nvv = nv[1]+nv[0]+"00";
			}
			else
				nvv = nv[0]+"000";
			
			System.out.println("nv "+nvv);
		}
		else{
			System.out.println("Not Matched");
		}
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