package org.subh.shunya.one;

public class SynchronizedTestB {

	public static void main(String[] args) {
		System.out.println("Synchronized Home SynchronizedTestB");
		
		TestAA oa1 = new TestAA();
		TestAA oa2 = new TestAA();
		TestThreadAA ta1 = new TestThreadAA(oa1, "subh");
		TestThreadAA ta2 = new TestThreadAA(oa2, "subh1");
		ta1.start();
		ta2.start();
	}
}
class TestThreadAA extends Thread{
	TestAA oa;
	String nm;
	public TestThreadAA(TestAA oa, String nm) {
		this.oa = oa;
		this.nm = nm;
	}
	public void run() {
		oa.testMethodA(nm);
	}
}
class TestAA{
	
	void testMethodA(String tName){
//		synchronized(this){
		synchronized(TestAA.class){
			for (int i = 0; i < 10; i++) {
				System.out.println(tName+" = "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}