package in.org.subh.learn.java;


public class ThreadSynchronizedObjectSharing {

	public static void main(String[] args) {
		
		System.out.println("Object Sharing ");
		
		ObjectShare oj1 = new ObjectShare();
		ObjectShare oj2 = new ObjectShare();
		
		Threader t = new Threader(oj1);
		t.start();
		
		Threader t2 = new Threader(oj2);
		t2.start();
	}
}

class Threader extends Thread{
	
	ObjectShare oj;
	public Threader(ObjectShare oj) {
		this.oj = oj;
	}
	
	@Override
	public void run() {
		System.out.println("Hello ");
		oj.count();
	}
}

class ObjectShare{
	
	int cnt = 0;
	
//	synchronized void count(){
	void count(){
		cnt++;
		System.out.println("cnt "+cnt);
	}
}