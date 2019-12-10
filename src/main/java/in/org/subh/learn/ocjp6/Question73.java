package in.org.subh.learn.ocjp6;
public class Question73 {

	public static void main(String[] args) {
		Hello c = new Hello(5);
		System.out.println(c.title);
	}

}

class Hello {
	String title;
	int value;

	public Hello() {
		title += " World";
	}

	public Hello(int value) {
		this.value = value;
		title = "Hello";
		
	}
	void getHello(){
//		Hello();
	}
}