package org.subh.shunya;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecutorCallRun {

	public static void main(String[] args) {
		
//		ExecutorService ex = Executors.newSingleThreadExecutor();
		ExecutorService ex = Executors.newFixedThreadPool(5);
//		ExecutorService ex = Executors.newCachedThreadPool();
//		ExecutorService ex = Executors.newScheduledThreadPool(5);
//		ExecutorService ex = Executors.newFixedThreadPool(1);
		/*ReturnThreadCall rt[] = {
								new ReturnThreadCall("subh"),
								new ReturnThreadCall("poo"),
								new ReturnThreadCall("umesh"),
								new ReturnThreadCall("anita"),
								new ReturnThreadCall("Lipa")
							};
		for(ReturnThreadCall rtt :rt){
			Future ft = ex.submit(rtt);
			System.out.println(ft.get());
		}
		ex.shutdown();*/					//All threads which are in pool will be terminated 
//		System.out.println(ex.submit(new ReturnThreadCall("subh")).get());
		
		ReturnThreadRun rt[] = {
									new ReturnThreadRun("subh"),
									new ReturnThreadRun("poo"),
									new ReturnThreadRun("umesh"),
									new ReturnThreadRun("anita"),
									new ReturnThreadRun("Lipa")
								};
		for(ReturnThreadRun rtt :rt){
			ex.submit(rtt);
		}
		ex.shutdown();
		
		ReturnThreadCall rtt = new ReturnThreadCall("subh");
	}
}

class ReturnThreadCall implements Callable{
	String tName;
	public ReturnThreadCall(String nm) {
		tName = nm;
	}
	public Object call() throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.println(tName + " C=C " + i);
		}
		return "subhash kewat got the job";
	}
}
class ReturnThreadRun implements Runnable{
	String tName;
	public ReturnThreadRun(String nm) {
		tName = nm;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(tName + " R=R " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
