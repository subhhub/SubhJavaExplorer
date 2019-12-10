package in.org.subh.learn.ocjp6;


public class Question55 {
	
	public static void main(String[] args) {
		new TestFive().go();	
	}
	
}

class TestFive {
	private int x;

	public void foo() {
		synchronized(this){
			int current = x;
			x = current + 1;
			System.out.print(x + ", ");
		}
	}

	 public  void go() {
		for (int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					foo();
//					System.out.print(x + ", ");
				}
			}.start();
		}
	}
}