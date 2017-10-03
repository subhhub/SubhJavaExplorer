package in.org.subh.shunya;

/**
 * @author esubkew
 * 
 * referenced by http://tutorials.jenkov.com/java-concurrency/thread-safety.html 
 *
 */
public class ThreadSharedResource {

	public static void main(String[] args) {
		
		System.out.println("Thread Safety and Shared Resources: Object Member Variables");
		
		NotThreadSafe sharedInstance = new NotThreadSafe();

		//Single Instance
//		new Thread(new MyRunnableSR(sharedInstance)).start();
//		new Thread(new MyRunnableSR(sharedInstance)).start();

		//Double Instance
		new Thread(new MyRunnableSR(new NotThreadSafe())).start();
		new Thread(new MyRunnableSR(new NotThreadSafe())).start();
	}

}

class MyRunnableSR implements Runnable {
	NotThreadSafe instance = null;

	public MyRunnableSR(NotThreadSafe instance) {
		this.instance = instance;
	}

	public void run() {
		System.out.println(instance.add("some text"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
			// Restore interrupted state...
		    Thread.currentThread().interrupt();
		}
	}
}

class NotThreadSafe {
	
	StringBuilder builder = new StringBuilder();

	public StringBuilder add(String text){
        return builder.append(text);
    }
}