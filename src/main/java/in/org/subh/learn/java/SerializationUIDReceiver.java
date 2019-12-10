package in.org.subh.learn.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationUIDReceiver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("SerializationUIDReceiver ");
		
		FileInputStream fis = new FileInputStream("uid.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationUIDTest ttf = (SerializationUIDTest)ois.readObject();	
		
		System.out.println("UIDTest "+ttf.i);
	}

}
