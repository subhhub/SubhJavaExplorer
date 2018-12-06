package org.subh.shunya;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadConcurrencyConcurrentHashMap {

	public static void main(String[] args) {
		System.out.println("ThreadConcurrentHashMap Main");
		
		//ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)
		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		concurrentHashMap.put("A","Apple");
		concurrentHashMap.put("B","Blackberry");
		/*for (Map.Entry e : concurrentHashMap.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}*/
	}
}
