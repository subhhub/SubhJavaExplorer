package org.subh.shunya;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUIDSender {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("SerializationUIDSender ");

		SerializationUIDTest it = new SerializationUIDTest();
		FileOutputStream fos = new FileOutputStream("uid.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(it);									//if method is not override than default method will be called
	}
}