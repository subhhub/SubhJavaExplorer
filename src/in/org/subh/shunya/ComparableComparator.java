package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparableComparator {

	public static void main(String[] args) {
		String s[] = { "B", "E", "E", "A", "Z", "C" };
		/*
		 * for(String vl : s){ System.out.println(vl); }
		 */

		/*System.out.println("After Sorting");
		// Arrays.sort(s);
		Arrays.sort(s, new MyComparator());
		for (String vl : s) {
			System.out.println(vl);
		}*/

		new ComparableComparator().shortStudent();
	}
	
	void shortStudent(){
		
		ArrayList al = new ArrayList();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		
		System.out.println("Default Sorting...");
		Collections.sort(al);		//if it is not implementing comparable then it will throw RE commparable required
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student stn = (Student) itr.next();
			System.out.println(stn.rollno + " " + stn.name + " " + stn.age);
		}
		
		/*System.out.println("Sorting by Name...");
		Collections.sort(al, new NameComparator());
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}*/
		
		/*System.out.println("sorting by age...");
		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st2 = (Student) itr2.next();
			System.out.println(st2.rollno + " " + st2.name + " " + st2.age);
		}*/
	}
}

class Student implements Comparable {
//class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o) {
		Student s1 = (Student) o;
		String nm = s1.name;
		/*if(name.equals("nm"))
			return 0;
		else if(name.compareTo(nm)>=0)
			return 1;
		else 
			return -1;*/
		return s1.name.compareTo(name);
	}
}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);		
//		return -s1.name.compareTo(s2.name);		//Reverse Sorting Order
//		return s2.name.compareTo(s1.name);		//Reverse Sorting Order
	}
}

class MyComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int cv = s2.compareTo(s1); // reverse descending
		// int cv = s1.compareTo(s2); //ascending
		// System.out.println("cv "+cv);
		return cv;
	}

}