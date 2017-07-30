package ocjp6;

//Question 9

class Atom {
	Atom() {
		System.out.print("atom ");
	}
}

class Rock extends Atom {
	Rock(String type) {
		System.out.print(type);
	}
}

public class Question9 extends Rock {
	Question9() {
		super("granite ");
		new Rock("granite ");
	}

	public static void main(String[] a) {
		new Question9();
	}
}
