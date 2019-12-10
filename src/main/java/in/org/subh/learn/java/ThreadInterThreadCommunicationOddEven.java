package in.org.subh.learn.java;

public class ThreadInterThreadCommunicationOddEven {

    public static void main(String... args) {
        Printer print = new Printer();
        
        //Single Thread
        /*Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
        t1.start();
        t2.start();*/
        
        //Two thread
        OddThread ot = new OddThread(print);
        EvenThread et = new EvenThread(print);
        et.start();
        ot.start();
    }

}

class TaskEvenOdd implements Runnable {
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        //System.out.println("Run method");
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number += 2;
        }

    }

}

class OddThread extends Thread{
	Printer pr;
	
	public OddThread(Printer pr) {
		this.pr = pr;
	}

	public void run() {
		for (int i = 1; i < 10; i = i+2) {
			pr.printOdd(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class EvenThread extends Thread{
	Printer pr;
	
	public EvenThread(Printer pr) {
		this.pr = pr;
	}

	public void run() {
		for (int i = 2; i < 10; i = i+2) {
			pr.printEven(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Printer {

    boolean isOdd = false;

    synchronized void printEven(int number) {
        if (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
    	if (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:" + number);
        isOdd = true;
        notifyAll();
    }

}