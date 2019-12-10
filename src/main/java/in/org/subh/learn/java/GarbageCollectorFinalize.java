package in.org.subh.learn.java;

public class GarbageCollectorFinalize {

	public static void main(String[] args) {

		GT gt = new GT();
		gt.show();
//		gt = null;			//GC invoked : Finalize method will be called.
		
		System.out.println("everything completed");
		
		new GCS(){			//GCS invoked : finalize method will be called 
			@Override
			void show() {
				System.out.println("GCS : Anonymous Class");
			}
		}.show();
		
//		System.gc();
	}
}

class GT{
	void show(){
		System.out.println("GT : show");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("I woke up, I am finalizer now my turn");
	}
}

class GCS{
	void show(){
		System.out.println("GCS : show");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("GCS : I woke up, I am finalizer now my turn");
	}
}