package in.org.subh.shunya.ocjp6;
public class Question37 {

	public static void main(String[] args) {
		
		Sub sb = new Sub();
	}
}

class Super {
	private int a;

	protected Super(int a) {
		this.a = a;
	}
}

class Sub extends Super {
	public Sub(int a) {
		super(a);
	}

	public Sub() {
		this(5);
	}
}