package in.org.subh.learn.ocjp6;


public class Question53 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.print("bar");
			}
		}).start();
	}
}