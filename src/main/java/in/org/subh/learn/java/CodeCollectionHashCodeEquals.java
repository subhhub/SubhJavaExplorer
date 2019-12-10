package in.org.subh.learn.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class CodeCollectionHashCodeEquals {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("## Override HashCode and Equal ##");
		
//		Price pc = new Price();
//		System.out.println("pc "+pc);
		
		/*Price pc1 = new Price("laptop", 40000); 	
		Price pc2 = new Price("hd", 4000); 	
		Price pc3 = new Price("pd", 400); 	
//		System.out.println(pc1 + " "+ pc2 +" "+ pc3);
		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(pc1, "laptop");
		hm.put(pc2, "hd");
		hm.put(pc3, "pd");
		System.out.println("hd "+ hm);*/
//		System.out.println(hm.get(pc1));
		
		/*Price pc4 = pc1;
		if(pc1 == pc4){
			System.out.println("equal");
		}else{
			System.out.println("false");
		}*/
		
		//Clone Test
		/*System.out.println(pc1);
		Price pc4 = (Price) pc1.clone();
		pc4.setItem("laptop20");
		System.out.println(pc4);*/
		 
		/*Set st = hm.keySet();
		Iterator it = st.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
//			System.out.println(hm.get(it.next()));
		}*/
		 
		 //Create a HashMap with mutable key
		HashMap<AccountKey, String> mp = new HashMap<AccountKey, String>();
		mp.put(new AccountKey(10,"subh1"), "subh");
		mp.put(new AccountKey(20,"subh2"), "pooja");
		mp.put(new AccountKey(30,"subh3"), "risa");
//		System.out.println(mp);
		 
		AccountKey ak = new AccountKey(95,"subh");
		AccountKey ak1 = new AccountKey(95,"subh");
		System.out.println(ak);
		System.out.println(ak1);
		System.out.println(ak.equals(ak1));
		
		/*Set stt = mp.keySet();
		Iterator itt = stt.iterator();
		while(itt.hasNext()){
			System.out.println(itt.next());
//		 	System.out.println(mp.get(it.next()));
		}*/
		
		String s1 = new String("ook");
		String s2 = new String("ook");
		System.out.println(s1==s2);
	}
}

class Price implements Cloneable{
	private String item;
	private int value;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Price(String item, int value) {
		this.item = item;
		this.value = value;
	}

	public String toString() {
		return item +" "+value;
	}
	
	public int hashCode() {
		int hc = 1;
		hc  = hc + value;
//		return hc;
		return 100;
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Price){
			Price pc = (Price) obj;
			if(pc.item.equals(item) && pc.value == value)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

class AccountKey
{
    private int accountNumber;
    private String holderName;
 
    public AccountKey(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
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
    
    //Depends only on account number
    /*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;  
        return result;
    }*/
 
    //Compare only account numbers
    /*@Override
    public boolean equals(Object obj) {
    	System.out.println("Overriden Equals Method ");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AccountKey other = (AccountKey) obj;
        if (accountNumber == other.accountNumber)
            return true;
        return false;
    }*/
 
   /* @Override
    public String toString() {
    	return new Integer(this.hashCode()).toString();
    }*/
}