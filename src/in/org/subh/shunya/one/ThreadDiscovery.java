package in.org.subh.shunya.one;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDiscovery {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("ThreadDiscovery Main");

//		SubscriberOne sbo = new SubscriberOne();
//		SubscriberOne sbo1 = new SubscriberOne();
		
		CallableThread st = new CallableThread();
//		st.start();
		
		ExecutorService xe = Executors.newCachedThreadPool();
		Future ft = xe.submit(st);
		System.out.println(ft.get());
		System.out.println("Main End");
	}
}

class CallableThread implements Callable<Integer> {
	public Integer call() {
		int c;
		int cnt = 0;
		for (; cnt < 5; cnt++) {
			System.out.println("call:" + cnt);
		}
		return cnt;
	}
}

