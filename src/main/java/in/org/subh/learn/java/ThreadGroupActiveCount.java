package in.org.subh.learn.java;

public class ThreadGroupActiveCount {
	public static void main(String[] args) {
		
		// Creating parent Thread Group
		ThreadGroup parentGroup = new ThreadGroup("Parent Thread Group ");

		Thread t1 = new Thread(parentGroup, "Thread 1") {
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread(parentGroup, "Thread 2") {
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t2.start();

		// Creating Child Thread Group
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Group");

		Thread t3 = new Thread(childGroup, "Thread 3") {
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3.start();

		// Checking Active thread count
		System.out.println(parentGroup.activeCount()); // Output : 3

		// Checking Active thread group count
		System.out.println(parentGroup.activeGroupCount()); // Output : 1
		
		//Destroying the whole group
        parentGroup.destroy();
	}
}