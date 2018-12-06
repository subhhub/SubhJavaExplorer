package org.subh.shunya.ocjp6;
import java.util.*;

public class Question213 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("pear");
		pq.add("orange");
		pq.add("ba");
		pq.add("aa");
		pq.add("cucumber");
		pq.add("apple");
		pq.add("banana");
		System.out.println(pq);
		System.out.println(pq.poll() + " " + pq.peek());
	}
}