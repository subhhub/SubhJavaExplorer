package org.subh.shunya.ocjp6;
import java.util.HashMap;
import java.util.Map;


public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map mp = new HashMap();
		mp.put(1, new Person("subh1"));
		mp.put(2, new Person("subh2"));
		mp.put(3, new Person("subh3"));
		
		System.out.println(mp.get(1));
	}

}
class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public int hashCode() {
		return 420;
	}
}