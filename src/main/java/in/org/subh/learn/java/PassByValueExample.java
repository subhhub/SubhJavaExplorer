package in.org.subh.learn.java;

public class PassByValueExample {

	public static void main(String args[]) {
		/*int number = 3;
		printNext(number);
		System.out.println("number Inside main(): " + number);*/		//3
		
		int[] number = {3,5,2};
		printNext(number);
		System.out.println("array number Inside main(): " + number[0]);		//10
		
		int vl = 10;
		AnimalRef a = new AnimalRef("Lion");
		System.out.println("Before Modify: " + a);
		modify(a, vl);
		System.out.println("After Modify: " + a);
		System.out.println("After Modify variable: " + vl);
		
		//Test Pass by Value vs Pass by Reference
		/*AnimalRef a1 = new AnimalRef("Lion");
		AnimalRef a2 = new AnimalRef("Crocodile");
		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap(a1, a2);
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2);*/
	}

	public static void printNext(int number) {
		number = 10;
		System.out.println("number Inside printNext(): " + number);		//10
	}

	public static void printNext(int[] number) {
		number[0] = 10;
		System.out.println("array number Inside printNext(): " + number[0]);	//10
	}
	
	public static void modify(AnimalRef animal, int vl) {
		animal.setName("Tiger");
		vl = 20;
	}
	
	public static void swap(AnimalRef animal1, AnimalRef animal2) {
		AnimalRef temp = new AnimalRef("");
		temp = animal1;
		animal1 = animal2;
		animal2 = temp;
	}
}

class AnimalRef {
	String name;

	public AnimalRef(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}