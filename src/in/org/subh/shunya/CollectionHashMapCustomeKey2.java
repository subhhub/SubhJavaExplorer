package in.org.subh.shunya;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class CollectionHashMapCustomeKey2 {
	
	static final Logger logger = Logger.getLogger(CollectionHashMapCustomeKey2.class);

	public static void main(String[] args) {

		EmployeeHE ehe1 = new EmployeeHE(101, "emp1");
		EmployeeHE ehe2 = new EmployeeHE(102, "emp3");
		EmployeeHE ehe3 = new EmployeeHE(103, "emp2");
		EmployeeHE ehe4 = new EmployeeHE(103, "emp2");
		System.out.println(ehe1.hashCode());
		System.out.println(ehe2.hashCode());
		System.out.println(ehe3.hashCode());
		System.out.println(ehe4.hashCode());
		
		System.out.println(ehe1.equals(ehe2));
		
		HashMap<EmployeeHE, String> mp = new HashMap<>();
		mp.put(ehe1, "value1");
		mp.put(ehe2, "value2");
		mp.put(ehe3, "value3");
		mp.put(ehe4, "value4");
		
		System.out.println(" mp "+mp.size());	//if hashcode and equals not implemented unique size 
		
		
		for(Map.Entry e: mp.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}
}

class EmployeeHE {

	private int accountNumber;
	private String holderName;

	public EmployeeHE(int accountNumber, String holderName) {
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
	
	/*@Override
	public int hashCode() {		//hash code Condition 1
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}*/

	@Override
	public int hashCode() {				//hash code Condition 2
		return 1;
	}
	
	//hash code Condition 3 no hashcode imlementation

	/*@Override
	public boolean equals(Object obj) {			//equals Condition 1
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeHE other = (EmployeeHE) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}*/
	
	/*@Override
	public boolean equals(Object obj) {			//equals Condition 2
		return true;
	}*/
	
	@Override
	public boolean equals(Object obj) {			//equals Condition 3
		return false;
	}
	

	@Override
	public String toString() {
		return "accountNumber" + accountNumber + " holderName "+holderName;
	}
}
