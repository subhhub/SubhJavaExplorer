package in.org.subh.learn.ocjp6;
public class Question27 {
	private final int id;

	public Question27(int id) {
		this.id = id;
	}

	public void updateId(int newId) {
//		id = newId;
	}

	public static void main(String[] args) {
		Question27 fa = new Question27(42);
		fa.updateId(69);
		System.out.println(fa.id);
		
		int a = 10;
		a = a++;
		System.out.println("a "+a);
				
	}
}