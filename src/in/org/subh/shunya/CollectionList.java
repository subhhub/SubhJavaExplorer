package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionList {
	public static void main(String[] args) {
		System.out.println("List Test");

		// Vector v = new Vector();
		
		List al = new ArrayList();// creating arraylist
		al.add("Ravi");
		al.add("Vijay");
		al.add(null);
		al.add(null);
		al.add("Ravi");
		al.add("Ajay");
		al.add(3, "Priya");
		System.out.println(al.size());		//size 6 count everything
		System.out.println("arraylist: " + al);
		
		Collection c = al;
		List cl = new ArrayList(19);
//		cl.add("pry");
//		System.out.println(cl);

		List al2 = new LinkedList();// creating linkedlist
		al2.add("James");
		al2.add(null);
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Ajay");
		al2.add(null);
		al2.add("Junaid");
		al2.add(3, "three");		//Add element in specifice position
		al2.set(3, "two");		//modify element in specifice position
		al2.remove(3);			//Remove element from specific index
		al2.remove("Swati");			//Remove element by name
//		System.out.println(al2.size());		//size 6 count everything
//		 System.out.println("linkedlist: " + al2);
//		 System.out.println(al2.get(3));
		
		/*ArrayList<String> al3=new ArrayList<String>();  
		al3.add("Amit");  
		al3.add("Vijay");  
		al3.add("Kumar");  
		al3.add(1,"Sachin");  
		System.out.println("element at 2nd position: "+al3.get(0)); */  
	
		/*Vector v = new Vector();
		v.add("subh");
		v.add("cisco");
		v.add("got");
		Enumeration vn = v.elements();*/
		
		
//		joinArrayList();
//		iteratorAndListIterator();
//		iteratorAndListIteratorModified();
		
	}
	
	static void iteratorAndListIterator(){

//		List<String> list = new ArrayList<String>();
		List<String> list = new LinkedList<String>();
//		LinkedList<String> list = new LinkedList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
 
        //Traversing list elements in forward direction using ListIterator
        ListIterator listIterator = list.listIterator();		//Flow one
        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());			//OUTPUT : FIRST SECOND THIRD
            System.out.println(listIterator.nextIndex()+" : "+listIterator.next());
        }
        System.out.println(listIterator.nextIndex());		//3
        
        //Traversing list elements in backward direction using ListIterator
        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());			//OUTPUT : THIRD SECOND FIRST
            System.out.println(listIterator.nextIndex()+" : "+listIterator.previous());
        }
        System.out.println(listIterator.nextIndex());		//0
        
        /*ListIterator listIterator2 = list.listIterator();	//Flow two
        while (listIterator2.hasNext()) {
            System.out.println(listIterator2.next());			//OUTPUT : FIRST SECOND THIRD
        }
        System.out.println(listIterator.nextIndex());*/		//3
	}
	
	static void iteratorAndListIteratorModified(){
	
		List<String> list = new ArrayList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");

        ListIterator<String> listIterator = list.listIterator();
        System.out.println(list);       //Output :    [FIRST, SECOND, THIRD]
 
        while (listIterator.hasNext()) {
            listIterator.next();
            //Modifying an element returned by next()
            listIterator.set("MODIFIED");
        }
        System.out.println(list);       //Output :    [MODIFIED, MODIFIED, MODIFIED]
 
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            //Removing an element
            iterator.remove();
        }
        System.out.println(list);    //Output : []
	}
	
	static void joinArrayList(){

		ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(111);
        list1.add(222);
        list1.add(333);
        list1.add(444);
        System.out.println(list1);     //Output : [111, 222, 333, 444]
         
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(555);
        list2.add(666);
        list2.add(777);
        list2.add(888);
        System.out.println(list2);    //Output : [555, 666, 777, 888]
         
        //Joining list1 and list2
//        list1.addAll(list2);
        list2.addAll(list1);
        
        //Inserting all elements of list2 at index 2 of list1
//        list1.addAll(2, list2);
        
        System.out.println(list1);    //Output : [111, 222, 333, 444, 555, 666, 777, 888]
        System.out.println(list2);    //Output : [555, 666, 777, 888, 111, 222, 333, 444]
	}
}
