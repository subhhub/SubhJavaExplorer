package in.org.subh.shunya.ocjp6;
class X {
	public void foo() {
		System.out.print("X ");
	}
}

public class Question113 extends X {
	public void foo() throws RuntimeException {
		super.foo();
		if (true)
			throw new RuntimeException();
		System.out.print("B ");
	}

	public static void main(String[] args) {
		new Question113().foo();
	}
}

interface AAA { public void m1(); }
abstract class E implements AAA { }