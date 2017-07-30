package in.org.subh.shunya.one;

public class SynchronizedTest {

	public static void main(String[] args) {
		System.out.println("Synchronized Home Test");
		
		TestA oa1 = new TestA();
		TestA oa2 = new TestA();
		TestA oa3 = new TestA();
		TestThreadA ta1 = new TestThreadA(oa1, "subh");
		TestThreadA ta2 = new TestThreadA(oa2, "subh1");
		TestThreadA ta3 = new TestThreadA(oa3, "subh2");
		ta1.start();
		ta2.start();
		ta3.start();
		
//		TestThreadB tb1 = new TestThreadB(oa1, "not synch subh");
//		TestThreadB tb2 = new TestThreadB(oa2, "not synch subh1");
//		TestThreadB tb3 = new TestThreadB(oa3, "not synch subh2");
//		tb1.start();
//		tb2.start();
//		tb3.start();
		
//		TestThreadC tc = new TestThreadC(ta3);
		
	}
}
class TestThreadA extends Thread{
	TestA oa;
	String nm;
	public TestThreadA(TestA oa, String nm) {
		this.oa = oa;
		this.nm = nm;
	}
	public void run() {
		oa.testMethodA(nm);
	}
}
class TestThreadB extends Thread{
	TestA oa;
	String nm;
	public TestThreadB(TestA oa, String nm) {
		this.oa = oa;
		this.nm = nm;
	}
	public void run() {
		oa.testMethodB(nm);
	}
}
class TestThreadC extends Thread{
	TestA oa;
	public TestThreadC(TestA oa) {
		this.oa = oa;
	}
	public void run() {
		oa.testMethodC();
	}
}

class TestA{
	
	static synchronized void testMethodA(String tName){
//		System.out.println("Method testMethodA ");
		for (int i = 0; i < 10; i++) {
			System.out.println(tName+" = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void testMethodB(String tName){
//		System.out.println("Method testMethodB ");
		for (int i = 0; i < 10; i++) {
			System.out.println(tName+" = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void testMethodC(){
//		System.out.println("Method testMethodC ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Test C "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
