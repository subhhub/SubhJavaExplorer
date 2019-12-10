package in.org.subh.learn.java;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSetDulicate {

	public static void main(String[] args) {
		System.out.println("*******Insert Duplicate in Set**********");
		
//		Set<EmployeeSet> test=new HashSet<EmployeeSet>();
		Set<EmployeeSet> test=new TreeSet<EmployeeSet>();
		EmployeeSet t1=new EmployeeSet(1,"sushil");
        EmployeeSet t2=new EmployeeSet(2,"sushil");
       
        test.add(t1);
        test.add(t2);

       System.out.println(test);
	}
}

class EmployeeSet {

	private int eid;
	private String ename;

	public EmployeeSet(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	/*
	 * overriding equals method saying even if two objects are having same eid
	 * and ename still they are not equal, means you are giving your own
	 * definition of equals
	 */

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;

		if (this.eid == ((EmployeeSet) obj).eid	&& this.ename == ((EmployeeSet) obj).ename)
			return true;
		return false;
	}

	/* overriding hashcode() method to generate hashcode based on its eid */

	public int hashCode() {
		return this.eid + 25;
	}
}