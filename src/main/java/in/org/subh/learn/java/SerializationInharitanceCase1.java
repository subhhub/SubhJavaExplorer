package in.org.subh.learn.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationInharitanceCase1 {
	
	public static void main(String[] args) throws Exception {
		BCase1 b1 = new BCase1(10, 20);

		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);

		/* Serializing B's(subclass) object */

		// Saving of object in a file
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Method for serialization of B's class object
		oos.writeObject(b1);

		// closing streams
		oos.close();
		fos.close();

		System.out.println("Object has been serialized");

		/* De-Serializing B's(subclass) object */

		// Reading the object from a file
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Method for de-serialization of B's class object
		BCase1 b2 = (BCase1) ois.readObject();

		// closing streams
		ois.close();
		fis.close();

		System.out.println("Object has been deserialized");

		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);
	}
}


/**
 * Java program to demonstrate 
 * that if superclass is serializable 
 * then subclass is automatically serializable
 * 
 * superclass A implementing Serializable interface
 */
class ACase1 implements Serializable {
	int i;

	// parameterized constructor
	public ACase1(int i) {
		this.i = i;
	}

}

// subclass B
// B class doesn't implement Serializable
// interface.
class BCase1 extends ACase1 {
	int j;

	// parameterized constructor
	public BCase1(int i, int j) {
		super(i);
		this.j = j;
	}
}

