package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionList {
	public static void main(String[] args) {
		System.out.println("List Test");

		List als = new ArrayList();
		System.out.println(als.size());		//default size 0; Returns the number of elements in this list. If this list contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
		
		List alss = new LinkedList();	
		System.out.println(alss.size());
		
		// Vector v = new Vector();
		
		
		
		String vl[] = {"subh", "poo", "pri"};
		
		List al = new ArrayList();// creating arraylist
		al.add("Ravi");
		al.add("Vijay");
		al.add(null);
		al.add(null);
		al.add(10);
		al.add("Ravi");
		al.add("Ajay");
		al.add(3, "Priya");
		al.set(1, "jiji");		//update
		System.out.println(al.size());		//size 8 count everything
		System.out.println("arraylist: " + al);
		
//		for(int i = 0; i<al.size(); i++)
//			System.out.println(al.get(i));
		for(Object v : al){
			System.out.println("v "+v);
		}
			
		
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
//		methodArrays();
		
		code1();
		
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

        Iterator ls = list.iterator();
        while(ls.hasNext()){
        	System.out.println(ls.next());
        	ls.remove();
        }
        
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
         
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
        System.out.println(list3);     //Output : [111, 222, 333, 444]
        
        //Joining list1 and list2
//        list1.addAll(list2);
        list2.addAll(list1);		//add one list to another
        
        //Inserting all elements of list2 at index 2 of list1
//        list1.addAll(2, list2);
        
        System.out.println(list1);    //Output : [111, 222, 333, 444, 555, 666, 777, 888]
        System.out.println(list2);    //Output : [555, 666, 777, 888, 111, 222, 333, 444]
	}
	
	static void methodArrays(){
		
		String []str = new String[]{"my", "name", "is", "varargs"};
        List<String> ls = Arrays.asList(str);							//Wrong
//        List<String> ls = new ArrayList<>(Arrays.asList(str));		//Right
        ls.add("ok");	//java.lang.UnsupportedOperationException due to immutable. To fix it we need to make is mutable
        
        System.out.println(ls);
	}
	
	static void code1(){
		Integer ary1[] = new Integer[]{2,4,5,3,9,5,7,3,78};
		Integer ary2[] = new Integer[]{20,4,50,3,9,5,70,3,78};
		
		List<Integer> ls = new ArrayList(Arrays.asList(ary1));
		List<Integer> ls2 = new ArrayList(Arrays.asList(ary2));
		
		ls2.addAll(ls);
		System.out.println(ls);
		System.out.println(ls2);
		
		HashSet hs = new HashSet(ls2);
		System.out.println(hs);
		
		List<Integer> ls3 = new ArrayList(hs);
		System.out.println("ls3>>>>>>>>>>>>>>. "+ls3);
	}
	
}
