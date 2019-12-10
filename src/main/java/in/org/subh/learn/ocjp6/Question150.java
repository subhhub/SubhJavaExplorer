package in.org.subh.learn.ocjp6;
public class Question150 {
	public enum Dogs {
		collie, harrier, shepherd
	};

	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		int i = 6;
		System.out.println(String.format("%05d",i));
		switch (myDog) {
		case collie:
			System.out.print("collie ");
		case harrier:
			System.out.print("harrier ");
		default:
			System.out.print("retriever ");
		}
	}
}