package ocjp6;
public class Question70 implements Runnable {
	synchronized void hit(long n) {
		for (int i = 1; i < 3; i++)
			System.out.print(n + "->" + i + " ");
	}

	public static void main(String[] args) {
		new Thread(new Question70()).start();
		new Thread(new Question70()).start();
	}

	public void run() {
		hit(Thread.currentThread().getId());
	}
}
