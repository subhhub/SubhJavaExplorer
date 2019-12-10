package in.org.subh.learn.java.one;

public class JavaCache {

	public static void main(String[] args) {
		
		Num nm = new Num();
		T1 t1 = new T1(nm);
		T2 t2 = new T2(nm, t1);
		T3 t3 = new T3(nm, t2);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class T1 extends Thread{

	Num nm;
	public T1(Num nm) {
		this.nm = nm;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 1 "+nm.getNum());
			interrupt();
		}
	}
}
class T2 extends Thread{
	
	Num nm;
	T1 t1;
	public T2(Num nm, T1 t1) {
		this.nm = nm;
		this.t1 = t1;
	}
	
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 2 "+nm.getNum());
	}
}
class T3 extends Thread{
	
	Num nm;
	T2 t2;
	public T3(Num nm, T2 t2) {
		this.nm = nm;
		this.t2 = t2;
	}
	
	public void run() {
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 3 "+nm.getNum());
	}
}

class Num{
	
	volatile int nm = 0;
	
	int getNum(){
		return ++nm;
	}
}








