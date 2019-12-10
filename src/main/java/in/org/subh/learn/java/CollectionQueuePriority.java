package in.org.subh.learn.java;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueuePriority {

	public static void main(String[] args) {

		//Creating a PriorityQueue with default Comparator.
        Queue<String> pQueue = new PriorityQueue<String>();
 
        //Inserting elements into pQueue.
        pQueue.offer("subh");
        pQueue.offer("pooja");
        pQueue.offer("priya");
        pQueue.offer("umesh");
        pQueue.offer("shrestha");
        System.out.println("pQueue "+pQueue);
		
//		employeePriority();
	}
	
	static void employeePriority(){
		// Instantiating MyComaparator
				EmployeePriorityComparator comparator = new EmployeePriorityComparator();

				// Creating PriorityQueue of Employee objects with MyComparator as Comparator
				Queue<EmployeePriority> pQueue = new PriorityQueue<EmployeePriority>(7, comparator);

				// Adding Employee objects to pQueue
				pQueue.offer(new EmployeePriority("AAA", 15000));
				pQueue.offer(new EmployeePriority("BBB", 12000));
				pQueue.offer(new EmployeePriority("CCC", 7500));
				pQueue.offer(new EmployeePriority("DDD", 17500));
				pQueue.offer(new EmployeePriority("EEE", 21500));
				pQueue.offer(new EmployeePriority("FFF", 29000));
				pQueue.offer(new EmployeePriority("GGG", 14300));

				// Removing the head elements
				System.out.println(pQueue.poll()); // Output --> CCC : 7500
				System.out.println(pQueue.poll()); // Output --> BBB : 12000
				System.out.println(pQueue.poll()); // Output --> GGG : 14300
				System.out.println(pQueue.poll()); // Output --> AAA : 15000
				System.out.println(pQueue.poll()); // Output --> DDD : 17500
				System.out.println(pQueue.poll()); // Output --> EEE : 21500
				System.out.println(pQueue.poll()); // Output --> FFF : 29000
	}
}

// Employee Class
class EmployeePriority {
	String name;
	int salary;

	// Constructor Of Employee
	public EmployeePriority(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}
}

// Employee Priority Class
class EmployeePriorityComparator implements Comparator<EmployeePriority> {
	
	@Override
	public int compare(EmployeePriority e1, EmployeePriority e2) {
		return e1.salary - e2.salary;
	}
}