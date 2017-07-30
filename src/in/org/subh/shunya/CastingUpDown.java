package in.org.subh.shunya;

public class CastingUpDown {

	public static void main(String[] args) {

//		 Mammal > Animal > Dog, Cat
		
		// Upcasting from subclass to super class.
		Dogy dog = new Dogy();
		AnimalType anim = (AnimalType) dog;
		anim.eat();
		
		Mammal mam = new Cat();
		AnimalType anim2 = new Dogy();
		
		// Downcasting of reference to subclass reference.
		AnimalType anim3 = new Cat();
		Cat cat = (Cat) anim3;
		
		AnimalType anim4 = new Cat();
		Dogy dog4 = (Dogy) anim4;			//Exception ClassCastException 

		//Solution before creating object pferome checking
		/*if (anim instanceof Cat) {
		    Cat cat = (Cat) anim;
		    cat.meow();
		} else if (anim instanceof Dog) {
		    Dog dog = (Dog) anim;
		    dog.bark();
		}*/
		

	}

}

interface Mammal {
    public void eat();
 
    public void move();
 
    public void sleep();
}

class AnimalType implements Mammal {
    public void eat() {
        System.out.println("Eating...");
    }
 
    public void move() {
        System.out.println("Moving...");
    }
 
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dogy extends AnimalType {
    public void bark() {
        System.out.println("Gow gow!");
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
 
class Cat extends AnimalType {
    public void meow() {
        System.out.println("Meow Meow!");
    }
}
