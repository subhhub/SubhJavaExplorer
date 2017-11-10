package in.org.subh.shunya;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationCustomize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Serialization Multiple Objects Main");

		AccountSer as = new AccountSer(); 
		
		FileOutputStream fos = new FileOutputStream("transferOut.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(as);									//if method is not override than default method will be called
		
		FileInputStream fis = new FileInputStream("transferOut.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		AccountSer ttf = (AccountSer)ois.readObject();			//if method is not override than default methd will be called
		System.out.println(ttf.unmae);
		System.out.println(ttf.pass);
		
		Object o;
	}

}
class AccountSer implements Serializable{
	String unmae = "subh";
//	String pass = "subh1";
	transient String pass = "subh1";
	
	private void writeObject(ObjectOutputStream oos) throws IOException {		//In order to customize serialization
		oos.defaultWriteObject();		//for default serialization
		String upss = "123" + pass;
		oos.writeObject(upss);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {		//In order to customize serialization
		ois.defaultReadObject();		//for default de-serialization
		String upssd = (String) ois.readObject();
		pass = upssd.substring(3);
	}
	
}