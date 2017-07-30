package ocjp6;
public class Question36 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		NewCat cat = (NewCat) animal;			//Can not cast super to sub class. Casting is possible only in Sub to Supper class. Because supper class can create object of sub class but not sub class 
		System.out.println(cat.noise());	
	}
}

class Animal {
	public String noise() {
		return "peep";
	}
}

class Dog extends Animal {
	public String noise() {
		return "bark";
	}
}

class Cat extends Animal {
	public String noise() {
		return "meow";
	}
}

class NewCat extends Dog {
	public String noise() {
		return "meow";
	}
}
