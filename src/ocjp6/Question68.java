package ocjp6;

public class Question68 implements Runnable {
	public void run() {
		System.out.print("running");
		
		/*for(int x = 1; x < 10; x++) {
			System.out.println("x "+x);
		}*/
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Question68());
		t.run();
		t.run();
		t.start();
	}
}