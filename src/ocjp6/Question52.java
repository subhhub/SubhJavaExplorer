package ocjp6;
public class Question52 implements Runnable {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new Question52());
		t.start();
		System.out.print("Started");
		t.join();
		System.out.print("Complete");
		
//		Thread tt = new T1();
//		tt.start();
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
	}
}

class T1 extends Thread{
	public void run(){
		for (int i = 0; i < 4; i++) {
			System.out.print("T1 "+i);
		}
	}
}