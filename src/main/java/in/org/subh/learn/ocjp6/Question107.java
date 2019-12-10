package in.org.subh.learn.ocjp6;
public class Question107 {
	public enum Dogs {
		collie, harrier
	};

	public static void main(String[] args) {
		Dogs myDog = Dogs.collie;
		switch (myDog) {
		case collie:
			System.out.print("collie ");
		case harrier:
			System.out.print("harrier ");
		}
		
		int a = new Integer(4);
	}
}
