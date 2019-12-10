package in.org.subh.learn.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadNewSingleThreadExecutor {
	public static void main(final String... args) throws InterruptedException, ExecutionException {
		// creates thread pool with one thread
		ExecutorService exService = Executors.newCachedThreadPool();
		
		// callable thread starts to execute
		final Future<Integer> callFuture = exService.submit(new ThreadNewSingleThreadExecutor().new CallableThread());
		
		// gets value of callable thread
//		final int callval = callFuture.get();
//		System.out.println("Callable:" + callval);

		// checks for thread termination
//		final boolean isTerminated = exService.isTerminated();
//		System.out.println(isTerminated);

		// waits for termination for 30 seconds only
//		exService.awaitTermination(30, TimeUnit.SECONDS);
//		exService.shutdownNow();
		
		exService.execute(new ThreadNewSingleThreadExecutor().new RunnableThread());	
		
		exService.shutdown();
	}

	// Callable thread
	class CallableThread implements Callable<Integer> {
		public Integer call() {
			int cnt = 0;
			for (; cnt < 5; cnt++) {
				System.out.println("call:" + cnt);
			}
			return cnt;
		}
	}
	
	// Runnable thread
	class RunnableThread implements Runnable {
		public void run() {
			int cnt = 0;
			for (; cnt < 5; cnt++) {
				System.out.println("call tt :" + cnt);
			}				
		}
	}
}