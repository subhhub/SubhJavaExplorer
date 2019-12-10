package in.org.subh.learn.java;

public class ThreadSynchronizationBlock {
	public static void main(String[] args) {
		
		System.out.println(" Synchronization Block ");
		
		DisplayBlock d1 = new DisplayBlock();
		DisplayBlock d2 = new DisplayBlock();
//		Display d3 = new Display();
		ThreadDisplayBlock dp = new ThreadDisplayBlock(d1, "Subh");
		ThreadDisplayBlock dp1 = new ThreadDisplayBlock(d2, "Subh-1");
		ThreadDisplayBlock dp2 = new ThreadDisplayBlock(d1, "Subh-2");
		dp.start();
		dp1.start();
		dp2.start();
	}

}

class ThreadDisplayBlock extends Thread{
	
	DisplayBlock d1;
	String name;
	
	public ThreadDisplayBlock(DisplayBlock d1, String name) {
		this.d1 = d1;
		this.name = name;
	}
	
	public void run() {
		d1.wish(name);
	}
}

class DisplayBlock{
	
	public void wish(String name){
		
		;;;;;;;;;;;;;; //1 Lakh line of code
		
//		synchronized(this){
		synchronized(DisplayBlock.class){	
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning : ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
		
		;;;;;;;;;;;;;; //1 Lakh line of code
	}
	
	public static synchronized void displayn(){
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static synchronized void displayc(){
		for (int i = 65; i < 97; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void displays(){
		for (int i = 97; i < 105; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}