package in.org.subh.learn.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationBasic {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		Transfer tf = new Transfer();
		System.out.println("tf "+tf.a);
		System.out.println("tf "+tf.b);
		
		//Serialization process
		FileOutputStream fos = new FileOutputStream("transfer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(tf);
		
		//De-Serialization process
		FileInputStream fis = new FileInputStream("transfer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Transfer ttf = (Transfer)ois.readObject();
		System.out.println(ttf.a);
		System.out.println(ttf.aa);
		System.out.println(ttf.aaa);
		System.out.println(ttf.b);
		System.out.println(ttf.bb);
		System.out.println(ttf.bbb);
		System.out.println(ttf.bba);
	}

}


class Transfer implements Serializable{
	int a = 10;
	static int aa = 100;
	static transient int aaa = 1000;
	transient int b = 20;		//it will not serialize and after deserialization we will get default value.
	static transient int bb = 200;	// it will serialize
	final int bbb = 3000;
	final transient int bba = 6000;		//it will serialize
}





