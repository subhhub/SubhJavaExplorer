package in.org.subh.learn.ocjp6;
class A180 {
	void foo() throws Exception {
		throw new Exception();
	}
}

class SubB2 extends A180 {
	void foo() {
		System.out.println("B ");
	}
}

public class Question180 {
	public static void main(String[] args) {
		A180 a = new SubB2();
//		a.foo();
		
		StringBuffer s = new StringBuffer("123456789");
		s.delete(0,3).replace(1,3,"24").delete(4,6);
		System.out.println(s);
	}
}	