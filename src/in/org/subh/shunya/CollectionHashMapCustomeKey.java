package in.org.subh.shunya;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionHashMapCustomeKey {

	public static void main(String[] args) {
		
//		hashCodeEqualString();
		hashCodeEqual();
	}
	
	static void hashCodeEqualString(){
//		StringBuffer str1=new StringBuffer();
//		StringBuffer str2=new StringBuffer();
		
		String str1=new String("subh");
		String str2=new String("subh1");
		
		Map table=new HashMap();
		table.put(str1, "Spring");		//add key,value returns null as its a new entry
		table.put(str2,"Hibernate");	//replaces old value with new Value and returns old value
		     
		System.out.println(str1.hashCode()+" "+str2.hashCode()); //null Spring(old value that was removed) 
		System.out.println(table);
		
		String str3=new String("subh");
		System.out.println(str1.hashCode()+" "+str2.hashCode()+" "+str3.hashCode()); 
		
		System.out.println(table.get(str3));	//Hows your equals method is override everything is depend on that only
		     
//		System.out.println(table); //returns {nataraz=Hibernate}
		
		
		
		/*StringBuffer strb2=new StringBuffer("JPPriya");
		System.out.println(strb2+" "+strb2.hashCode());
		strb2.append("poo");
		System.out.println(strb2+" "+strb2.hashCode());*/
	}
	
	static void hashCodeEqual(){
		// Create a HashMap with mutable key
		HashMap<AccountMan, String> map = new HashMap<AccountMan, String>();

		// Create key 1
		AccountMan a1 = new AccountMan(1);
		a1.setHolderName("A_ONE");
		// Create key 2
		AccountMan a2 = new AccountMan(2);
		a2.setHolderName("A_TWO");
		// Create key 3
		AccountMan a4 = new AccountMan(1);
		a1.setHolderName("A_ONE");

		System.out.println(a1.hashCode()+ " "+a2.hashCode()+ " "+a4.hashCode() + " "+ a1.equals(a4));	
		
		// Put mutable key and value in map
		map.put(a1, a1.getHolderName());
		map.put(a2, a2.getHolderName());
		map.put(a4, a2.getHolderName());

		// Change the keys state so hash map should be calculated again
//		a1.setHolderName("Defaulter");
//		a2.setHolderName("Bankrupt");

		System.out.println(map.size());		
		
		if(a1 == a2)
			System.out.println("hascode are equal");
		else
			System.out.println("hascode are not equal");
		
		// Success !! We are able to get back the values
		System.out.println(map.get(a1)); // Prints A_ONE
		System.out.println(map.get(a2)); // Prints A_TWO

		// Try with newly created key with same account number
		AccountMan a3 = new AccountMan(1);
		a3.setHolderName("A_THREE");
		
		System.out.println(a1.equals(a3));

		System.out.println(a1.hashCode()+ " "+a2.hashCode()+ " "+a4.hashCode()+ " "+a3.hashCode());	
		
		// Success !! We are still able to get back the value for account number 1
		System.out.println(map.get(a3)); // Prints A_ONE
		
		if(a1==a3)
			System.out.println("True Reference");
		else
			System.out.println("false Reference");
		
		
		/*Map mp = new TreeMap();		//RE: ClassCastException due to comparable
		mp.put(a1, "subh");
		mp.put(a2, "poo");
		mp.put(a3, "priya");
		System.out.println(mp +" "+mp.size());*/
	}
}

class AccountMan {

	private int accountNumber;
	private String holderName;

	public AccountMan(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;	
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	/*@Override
	public int hashCode() {
		return 1;
	}*/
	
	// Depends only on account number
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;

//		return accountNumber;

//		return 100;
	}*/
	
//	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		AccountMan other = (AccountMan) obj;
		if (accountNumber == other.accountNumber)
			return true;
		
		return false;
//		return true;
	}
	
	// Compare only account numbers
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountMan other = (AccountMan) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;

//		return false;
	}*/
}
