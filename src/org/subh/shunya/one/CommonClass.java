package org.subh.shunya.one;

public class CommonClass {
    public static void main(String[] arg) {
    
    	SyncDead sd1 = new SyncDead();
    	SyncDead sd2 = new SyncDead();
    	
    	ThreadDead1	td1 = new ThreadDead1(sd1,sd2);
    	ThreadDead2	td2 = new ThreadDead2(sd1,sd2);
    	
    	td1.start();
    	td2.start();
    }
}


class ThreadDead1 extends Thread{
	
	SyncDead sd;
	SyncDead sd1;
	
	public ThreadDead1(SyncDead sd, SyncDead sd1) {
		this.sd = sd;
		this.sd1 = sd1;
	}
	
	public void run(){
        while(true){
            synchronized(sd){
                synchronized(sd1){
                	System.out.println(Thread.currentThread().getName()+" "+sd +" "+ sd1);
                }
            }
        }
    }
}

class ThreadDead2 extends Thread{
	
	SyncDead sd;
	SyncDead sd1;
	
	public ThreadDead2(SyncDead sd, SyncDead sd1) {
		this.sd = sd;
		this.sd1 = sd1;
	}
	
	public void run(){
        while(true){
            synchronized(sd){
                synchronized(sd1){
                	System.out.println(Thread.currentThread().getName()+" "+sd +" "+ sd1);
                }
            }
        }
    }
}

class SyncDead{
	
	void show(){
		System.out.println("hello Class");
	}
}











