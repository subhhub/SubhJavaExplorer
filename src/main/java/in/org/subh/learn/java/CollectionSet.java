package in.org.subh.learn.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		System.out.println("Set Main");
		
		//if i will 
		
//		Set st = new HashSet();
//		HashSet st = new HashSet();
		LinkedHashSet st = new LinkedHashSet();
//		Set st = new TreeSet();
		st.add(20);
//		st.add("Subhash");		//In case of TreeSet it will throw RE. ClassCastException.
//		st.add(null);			//RE: Nullpointer exception
		st.add(30);
		st.add(5);
		st.add(5);
//		st.add(null);			//In case of TreeSet it will throw RE. NullPionterException (1.6)
//		System.out.println(st);
//		System.out.println(st.size());		// default size of Set implementation is 0
		
		/*Set st = new TreeSet();  				//No Initial Capacity
		st.add(new String("Subhash"));
		st.add(new String("Risa"));		
		st.add(new String("Pooja"));
		st.add(new String("Priya"));
		System.out.println(st);*/
		
		/*Set sti = new TreeSet();
		sti.add(new Integer(20));
		sti.add(new Integer(43));		
		sti.add(new Integer(32));
		sti.add(new Integer(32));
		sti.add(new Integer(87));
		System.out.println(sti);*/
		
		/*st.add(new StringBuffer("Subhash"));
		st.add(new StringBuffer("Risa"));		
		st.add(new StringBuffer("Pooja"));
		st.add(new StringBuffer("Priya"));
		System.out.println(st);*/
		
//		StringBuffer s = new StringBuffer("nuew");
		
		/*Set poo = new TreeSet();
		poo.add(new Pooja());
		poo.add(new Pooja());
		poo.add(new Pooja());
		System.out.println(poo);*/		//Exception RE ClassCastException	
		
		
//		Insert duplicate value in Set
		Set<Pooja> set = new HashSet<Pooja>();
        
		//Adding elements to HashSet
        set.add(new Pooja("Avinash", 121, "ECE"));
        set.add(new Pooja("Bharat", 101, "EEE"));
        set.add(new Pooja("Malini", 151, "Civil"));
        set.add(new Pooja("Suresh", 200, "IT"));
        set.add(new Pooja("Vikram", 550, "CS"));
        set.add(new Pooja("Bharat", 301, "IT")); 
        set.add(new Pooja("Amit", 301, "IT"));           //duplicate element
        set.add(new Pooja("Bhavya", 872, "ECE"));
        set.add(new Pooja("Naman", 301, "CS"));        //duplicate element
        set.add(new Pooja("Samson", 565, "Civil"));
        
        System.out.println("set "+set);
	}
}

class Pooja{
	String name;
    int rollNo;
    String department;
 
    public Pooja(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }
    
   /* @Override
    public int hashCode() {
        return rollNo;
    }
 
    @Override
    public boolean equals(Object obj) {
    	Pooja pooja = (Pooja) obj;
        return (rollNo == pooja.rollNo);
    }*/
 
    @Override
    public String toString() {
        return rollNo+"-"+name;
    }
}
