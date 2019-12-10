package in.org.subh.learn.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationInharitance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("SerializationInharitance Multiple Objects Main");

		Employeee b1 = new Employeee();
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
		Employeee b2 = (Employeee) ois.readObject();
	}
}

class Addresss{
    private String street; 
    private String area;   
    private String city;
}
class Employeee implements Serializable{
    private String name;
    private Addresss address;
}
