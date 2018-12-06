package org.subh.shunya;

//Java code to explain effect of 
//Serilization on singleton classes
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonS implements Serializable {
	// public instance initialized when loading the class
	public static SingletonS instance = new SingletonS();

	private SingletonS() {
		// private constructor
	}
}

public class DesignPatternSingeltonBreakSerialization {

	public static void main(String[] args) {
		try {
			SingletonS instance1 = SingletonS.instance;
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

			SingletonS instance2 = (SingletonS) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}