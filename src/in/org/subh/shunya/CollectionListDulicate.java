package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionListDulicate {

	public static void main(String[] args) {
		System.out.println("*******Insert Duplicate in List**********");
		

		List<EmployeeList> ls = new ArrayList();
		
		EmployeeList t1=new EmployeeList(1,"sushil");
		EmployeeList t2=new EmployeeList(2,"sushil");
		EmployeeList t3=new EmployeeList(1,"sushil");
		EmployeeList t4=new EmployeeList(4,"sushil");
		
		ls.add(t1);
		ls.add(t2);

		System.out.println(ls);
		
		boolean bl = ls.contains(t3);
		System.out.println(bl);
		
	}
}

class EmployeeList{
	
	private int eid;
	private String ename;

	public EmployeeList(int eid, String ename) {
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

		if (this.eid == ((EmployeeList) obj).eid	&& this.ename == ((EmployeeList) obj).ename)
			return true;
		return false;
	}

	/* overriding hashcode() method to generate hashcode based on its eid */

	public int hashCode() {
		return this.eid + 25;
	}
}