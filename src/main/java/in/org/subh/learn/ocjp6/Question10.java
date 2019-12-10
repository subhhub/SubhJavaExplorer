package in.org.subh.learn.ocjp6;

interface Foo{
	int bar();
}
public class Question10 {

	class A implements Foo{

		public int bar() {
			return 1;
		}
	}
	public int fubar(Foo foo){
		return foo.bar();
	}
	
	public void testfoo(){
		/*class A implements Foo{
			public int bar() {
				return 2;
			}
		}*/
		System.out.println(fubar(new A()));
	}
	public static void main(String[] args) {
		new Question10().testfoo();
	}
}
