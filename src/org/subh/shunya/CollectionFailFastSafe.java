package org.subh.shunya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionFailFastSafe {

	public static void main(String[] args) {

		new CollectionFailFastSafe().failFastList();
//		failSafeList();
		
//		failFastMap();
//		 failSafeMap();

	}

	void failFastList() {

		// Creating an ArrayList of integers
		List list = new ArrayList();
//		List list = Collections.synchronizedList(new ArrayList());

		// Adding elements to list
		list.add(1452);
		list.add(6854);
		list.add(8741);
		list.add(6542);
		list.add(3845);

		// Getting an Iterator from list
//		Iterator<Integer> it = list.iterator();
		ListIterator it = list.listIterator();

		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
//			it.add("subh");
			list.add(8457); // This will throw ConcurrentModificationException
		}
//		System.out.println(list);
		
		/* Remove the second value of the list, while iterating over its elements,
         * using the iterator's remove method. */
        /*while(it.hasNext()) {
             String value = it.next();
             if(value.equals("Value2"))
                  list.remove();
             else
                  System.out.println(value);
        }*/
		
	}
	
	static void failSafeList() {

		// Creating an ArrayList of integers
		List  list = new CopyOnWriteArrayList ();

		// Adding elements to list
		list.add(1452);
		list.add(6854);
		list.add(8741);
		list.add(6542);
		list.add(3845);

		// Getting an Iterator from list
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			list.add(8457); // This will throw ConcurrentModificationException
		}
	}

	static void failFastMap() {
		Map premiumPhone = new HashMap();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			Object obj = premiumPhone.get(iterator.next());
			System.out.println(obj);
			premiumPhone.put("Sony", "Xperia Z");
		}
	}

	static void failSafeMap() {

		ConcurrentHashMap premiumPhone = new ConcurrentHashMap();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
	}
}
