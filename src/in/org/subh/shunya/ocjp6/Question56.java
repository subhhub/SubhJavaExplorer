package in.org.subh.shunya.ocjp6;
public class Question56 implements Runnable {

	public void run() {
		System.out.println("run.");
		throw new RuntimeException("Problem");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Question56());
		t.start();
		System.out.println("End of method.");
	}
}