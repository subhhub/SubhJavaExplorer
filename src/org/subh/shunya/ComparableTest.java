package org.subh.shunya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class ComparelePerson implements Comparable<ComparelePerson>  {
	private String fname;
	private String lname;
	
	public ComparelePerson(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	public int compareTo(ComparelePerson cbp) {
//		return lname.compareTo(cbp.lname);
		return cbp.lname.compareTo(lname);
	}
	
	public String toString() {
		return fname+" "+lname;
	}
}
public class ComparableTest{
	public static void main(String[] args) {
		System.out.println("Compareble Sorting");
		
		List<ComparelePerson> ln = new ArrayList<ComparelePerson>();
		ln.add(new ComparelePerson("wnm","ln"));
		ln.add(new ComparelePerson("cnm","aln"));
		ln.add(new ComparelePerson("anm","cln"));
		System.out.println("ln="+ln);
		
		//comparable sorting
		Collections.sort(ln);
		System.out.println("ln="+ln);	
	
		//comparator sorting
		/*Collections.sort(ln, new FnameComparator());
		System.out.println("lnFN="+ln);	
		
		Collections.sort(ln, new LnameComparator());
		System.out.println("lnLN="+ln);	*/
	}
}


class FnameComparator implements Comparator<ComparelePerson>{
	public int compare(ComparelePerson oa, ComparelePerson ob){
		return oa.getFname().compareTo(ob.getFname());
	}
}
class LnameComparator implements Comparator<ComparelePerson>{
	public int compare(ComparelePerson oa, ComparelePerson ob){
		return oa.getLname().compareTo(ob.getLname());
	}
}