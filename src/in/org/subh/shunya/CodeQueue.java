package in.org.subh.shunya;

public class CodeQueue {
	 public static void main(String[] args) {
		 
         Queue queue = new Queue(10); // queue holds 10 elements
         
         queue.insert(31);
         queue.insert(49);
         System.out.println("my queue "+queue);
         
         queue.remove();
         queue.remove();

         queue.insert(90);
         queue.insert(81);
         queue.insert(72);
         queue.insert(22); // At this point we got to deal with wrapAround, because rear must be pointing to last position.
         
         System.out.print("Deleted elements from queue: ");
         System.out.print(queue.remove()+ " ");
         System.out.print(queue.remove()+ " ");
         System.out.print(queue.remove()+ " ");
         System.out.print(queue.remove()+ " ");
         
         /*UQueue uQueue = new UQueue(5);
 		
 	 	uQueue.put(1);
 		uQueue.put(2);
 		uQueue.put(3);
 		uQueue.put(4);
 		uQueue.put(5);
// 		uQueue.put(6);
 		
 		System.out.println(" uQueue.get( "+uQueue.get());
 		System.out.println(" uQueue.get( "+uQueue.get());
 		System.out.println(" uQueue.get( "+uQueue.get());
 		
 		uQueue.put(10);
 		uQueue.put(20);
 		
 		System.out.println(" uQueue.get( "+uQueue.get());
 		
 		System.out.println(" uQueue "+uQueue);*/
         
  }
}

class UQueue{
	
	int arry[];
	int cas = 0;
	int sz;
	
	public UQueue(int size) {
		arry = new int[size];
		sz = size;
	}
	
	public void put(int el){
		
		if(cas<sz){
			arry[cas] = el;
			cas++;
		}
		else
			throw new ArrayIndexOutOfBoundsException("Queue is Full ");
	}
	
	public int get(){
		
//		System.out.println(" arry.length "+arry.length + " "+ cas);
		if(cas==0)
			throw new ArrayIndexOutOfBoundsException("Queue is Empty ");
		
		int vl = 0;
		System.out.println(sz +" "+cas);
		if(cas<=sz){
			vl = arry[sz-cas];
			cas = cas-1;
		}
		System.out.println(sz +" "+cas);
		
		return vl;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for (int i = 0; i < arry.length; i++) {
//			sb = arry[i];
			sb.append( arry[i]+", ");
		}
		sb.append("]");
		
		System.out.println(sz +" "+cas);
		
		return sb.toString();
	}
}

class Queue {

	private int[] queueAr;
	private int size; // Size of Queue

	private int rear; // elements will be added at rear.
	private int front; // elements will be removed from front
	private int number; // holds number of elements in Queue, initialized with 0  by default

	public Queue(int size) {
		this.size = size;
		queueAr = new int[this.size];
		rear = 0;
		front = 0;
	}

	public void insert(int value) {			//Insert element at rear in Queue
		if (isFull()) {
			throw new QueueEmptyException("Cannot insert " + value + ", Queue is full");
		}
		
		if (rear == size) // means we are at last position (deal with wrapAround)
			rear = 0;
		queueAr[rear++] = value; // Insert element and increment rear
		number++; // increase number of elements in Queue
	}

	public int remove() {			//Removes elements from front of Queue
		if (isEmpty()) {
			throw new QueueEmptyException("Queue is empty");
		}

		int deletedValue = queueAr[front++]; // get value at front and than increment front
		if (front == size) // deal with wrapAround
			front = 0;
		number--; // reduce number of elements in Queue
		return deletedValue;
	}

	public boolean isEmpty() {
		return (number == 0);
	}

	public boolean isFull() {
		return (number == size);
	}
}

/**
 * Exception to indicate that Queue is empty.
 */
class QueueEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QueueEmptyException() {
		super();
	}

	public QueueEmptyException(String message) {
		super(message);
	}

}