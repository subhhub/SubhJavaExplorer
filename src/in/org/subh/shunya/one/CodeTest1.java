package in.org.subh.shunya.one;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class CodeTest1 {
	
	void reltioCode() {
		String str = "Fortune Cookie1 " + "% " + "Fortune Cookie 2 " + "% " 	+ "Fortune Cookie N";
		
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreElements()) {
			String s = st.nextToken("%");
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		PCO pc = new PCO();
		
		/*Thread t1 = new Thread( new TP(pc));
		Thread t2 = new Thread( new TP(pc));
		t1.start();
		t2.start();*/
		
//		String rgx = "([0-9]){1}([-])([0-9]{1})";
		String rgx = "([0-9]){1}([-])([0-9]{3})|([0-9]){1}([-])([0-9]{2})|([0-9]){1}([-])([0-9]{1})";
		String value = "0-5";
		boolean bl = Pattern.matches(rgx , value);
		
		char val[] = value.toCharArray();
		
		System.out.println("bl "+bl);
		System.out.println("value "+value);
		
		final String splitValue[] = value.split("-");
		final String firstPart = splitValue[0];
		final String secondPart = splitValue[1];
	
		int len = secondPart.length();
		
//		2-45 --> 2-045 --> -0452 --> 0452 --> 5204
//		2-345 --> -3452 --> 3452 --> 5234
//		2-5 --> 2-005 -->-0052 --> 0052 -->5200
//		2-0 --> 2-000 -->0002 --> 0200
//		0-2 --> 0-002 --> 0020 --> 2000
		
		StringBuffer sb = new StringBuffer();
		
		if(len==1)
			sb = sb.append("00").append(secondPart).append(firstPart);
//			value = "00"+secondPart+firstPart;
//			value = "00"+secondPart+firstPart;
		else if(len==2)
			sb = sb.append("0").append(secondPart).append(firstPart);
//			value = "0"+secondPart+firstPart;
		else
			sb = sb.append(secondPart).append(firstPart);
//			value = secondPart+firstPart;
		
		System.out.println(" value "+sb);
//		sb.append(sb.substring(2));
		
//		Character.DIRECTIONALITY_LEFT_TO_RIGHT;
		
		value = sb.substring(2).concat(sb.substring(0,2));
//		value = value.substring(2)+value.substring(0, 2);
		
		System.out.println(" value "+value);
	}  
}

class TP implements Runnable{
	
	PCO pc;
	
	public TP(PCO pc) {
		this.pc = pc;
	}
	
	@Override
	public void run() {
		
		for (int i = 2; i < 10; i=i+2) {
			pc.prod(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

class CP implements Runnable{
	
	PCO pc;
	
	public CP(PCO pc) {
		this.pc = pc;
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i < 10; i=i+2) {
			pc.cons(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

class PCO{
	
	boolean flg;
	
	public synchronized void prod(int p){
		if(flg){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("e "+e);
			}
		}
		
		System.out.println("Produec "+p);
		flg = true;
		this.notify();
	}

	public synchronized void cons(int c){
		if(!flg){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("e "+e);
			}
		}
		
		System.out.println("Consume "+c);
		flg = false;
		this.notify();
	}
}