package ocjp6;
public class Question47 {

	static void test() throws Error, ExceptionInInitializerError {
		if (true)
			throw new AssertionError();
		System.out.print("test ");
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
		System.out.print("end ");
	}
}
