package ocjp6;
public class Question49 {

	public static void main(String[] args) {
		try {
			A1 a = new A1();
			a.method1();
		} catch (Exception e) {
			System.out.print("an error occurred");
		}
		
		System.out.printf("hello %f and E is approximately %b", Math.PI, Math.E);
	}
}
class A1{
	public void method1(){
		B1 b = new B1();
		b.method2();
	}
}
class B1{
	public void method2(){
		C1 c = new C1();
		c.method3();
	}
}
class C1{
	public void method3(){
	}
}