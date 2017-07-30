package in.org.subh.shunya;

public class ExceptionTryFinally {

	public static void main(String[] args) {
		System.out.println("Exception Try Finally Main");
		
		int rs = new ExceptionTryFinally().doTheWork();
		System.out.println(rs);
		
	}

	public int doTheWork() {
		try {
			System.out.println("Before Exception ");
			int vl = 10/0;
			System.out.println("After Exception ");
			return 2;
		} catch (ArithmeticException e) {
			System.out.println("Exception "+e);
//			return 0;
		} catch (NullPointerException e) {
			System.out.println("Exception "+e);
//			return 0;
		}/*finally{
			System.out.println("All done");
			try {
				int vl = 10/0;
			} catch (Exception e) {
				System.out.println("hello math");
			}
			return 1;
		}*/
		return 1;
	}
}
