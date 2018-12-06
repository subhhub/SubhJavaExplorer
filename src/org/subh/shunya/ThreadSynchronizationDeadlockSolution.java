package org.subh.shunya;

public class ThreadSynchronizationDeadlockSolution {

	public static void main(String[] args) {
		
		System.out.println("Deadlock using Synchronization");
		
	        A a = new A();
	        B b = new B();
	 
	        ThreadBlock1 block1 = new ThreadBlock1(a, b);
	        ThreadBlock2 block2 = new ThreadBlock2(a, b);
	 
	        block1.start();
	        block2.start();
    }
}

class ThreadBlock1 extends Thread{
	
	A a;
    B b;
	public ThreadBlock1(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
        synchronized (b) {
            try {
                // Adding delay so that both threads can start trying to lock resources
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Thread-1 have A but need B also
            synchronized (a) {
                System.out.println("In block 1");
            }
        }
    }
}
class ThreadBlock2 extends Thread{
	
	A a;
    B b;
	public ThreadBlock2(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
        synchronized (a) {
            // Thread-2 have B but need A also
            synchronized (b) {
                System.out.println("In block 2");
            }
        }
    }
}

//Resource A
class A {
    private int i = 10;
}

// Resource B
class B {
    private int i = 20;
}
