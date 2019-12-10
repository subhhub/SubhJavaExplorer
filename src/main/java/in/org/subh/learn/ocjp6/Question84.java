package in.org.subh.learn.ocjp6;
interface DeclareStuff {
	public static final int EASY = 3;

	void doStuff(int t);
	public void method1();
	String toString();
}
interface Cd extends DeclareStuff {
	public void method1();
	public void method1(int x);
}
/*public class Question84 implements DeclareStuff {
	public static void main(String[] args) {
		int x = 5;
		new Question84().doStuff(++x);
	}

	void doStuff(int s) {
		s += EASY + ++s;
		System.out.println("s " + s);
	}
}*/
