package in.org.subh.shunya;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {

	public static void main(String[] args) {
		
		//Creating a PriorityQueue with default Comparator.
        Queue<Integer> pQueue = new PriorityQueue<Integer>();
 
        //Inserting elements into pQueue.
        pQueue.offer(21);
        pQueue.offer(17);
        pQueue.offer(67);
        pQueue.offer(null);			//RE: NPE
        pQueue.offer(41);
        pQueue.offer(9);
        pQueue.offer(67);		//Allows duplicate
        pQueue.offer(31);
        System.out.println("pQueue "+pQueue);		//[9, 17, 31, 41, 21, 67, 37]
 
        //Removing the head elements
        System.out.println(pQueue.poll());     //Output : 9
        System.out.println(pQueue.poll());     //Output : 17
        System.out.println(pQueue.poll());     //Output : 21
        System.out.println(pQueue.poll());     //Output : 31
        System.out.println(pQueue.poll());     //Output : 37
        System.out.println(pQueue.poll());     //Output : 41
        System.out.println(pQueue.poll());     //Output : 67
        
        System.out.println("pQueue "+pQueue);
	}
}
