package in.org.subh.shunya.one;

import java.util.StringTokenizer;

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
		
		Integer it = new Integer(10);
	}  
	
	public String getPostcode(Person person) {
		
//		return person?getAddress()?.getPostcode(); 
		
		Address address = person.getAddress();  
		return address.getPostalcode();  
	}
	
	/*public String getPostcode(Person person) {  
		if (person != null) {  
			Address address = person.getAddress();  
			if (address != null) {  
				return address.getPostalcode();  
			}  
		}  
		return null;  
	}  */
}

class Person{
	
	private Address address;

	public Address getAddress () {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

class Address {
	
	private String postalcode;

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
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