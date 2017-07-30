package in.org.subh.shunya;

public class ThreadThreadLocal {

	public static void main(String[] args) {
		System.out.println("Thread Local");

		/*ThreadLocal tl = new ThreadLocal(){
			@Override
			protected Object initialValue() {
				return "91+";
			}
		};
		System.out.println(tl.get());
		tl.set("subh");
		System.out.println(tl.get());*/
		
		CustomerLocal cl1 = new CustomerLocal();
		CustomerLocal cl2 = new CustomerLocal();
		CustomerLocal cl3 = new CustomerLocal();
		cl1.start();
		cl2.start();
		cl3.start();
	}
}

class CustomerLocal extends Thread{
	
	static int cl = 10;
	/*InheritableThreadLocal itt = new InheritableThreadLocal(){		//it works at the time of inheritance
		protected Object childValue(Object parentValue) {
			return parentValue;
			
		};
	};*/
	
	ThreadLocal tl = new ThreadLocal(){
		@Override
		protected Object initialValue() {
			return ++cl;
		}
	};
	
	public CustomerLocal() {
		tl.set(++cl);
	}
	
	@Override
	public void run() {
		System.out.println("Customer Thread "+Thread.currentThread().getName() +" "+ tl.get());
	}
}
