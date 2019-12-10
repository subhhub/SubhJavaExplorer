package in.org.subh.learn.java;

public class ThreadDaemon {
	
	public static void main(String[] args) {
		System.out.println("Thread Daemon ");

		Thread daemonThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						System.out.println("Daemon thread is running");
					}

				} catch (Exception e) {

				} finally {
					System.out.println("Daemon Thread exiting"); // never called
				}
			}
		}, "Daemon-Thread");

		daemonThread.setDaemon(true); // making this thread daemon

		daemonThread.start();
	}
}
