package in.org.subh.shunya;

import java.io.Serializable;

public class SerializationInharitance {

	public static void main(String[] args) {
		System.out.println("SerializationInharitance Multiple Objects Main");
		
		String s = "subhas";
		String s1 = new String("subh");
		
		System.out.println(s.intern().hashCode());
		System.out.println(s1.intern().hashCode());
	}
}

//Case 1
class AnimalParent implements Serializable{
	int i = 10;
}
class DogClind {
	int j = 30;
}

//Case 2
class Animal{
	int i = 10;
}
class Dog extends Animal implements Serializable{
	int j = 30;
}


