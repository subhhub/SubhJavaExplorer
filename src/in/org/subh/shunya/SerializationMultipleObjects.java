package in.org.subh.shunya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationMultipleObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		System.out.println("Serialization Multiple Objects Main");
		
		Transfer1 t1 = new Transfer1();		
		Transfer2 t2 = new Transfer2();		
		Transfer3 t3 = new Transfer3();		
		
		//Serialization Multiple objects
		FileOutputStream fos = new FileOutputStream("transferOut.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);
		oos.writeObject(t2);
		oos.writeObject(t3);
		
		//de-Serialization Multiple objects
		FileInputStream fis = new FileInputStream("transferOut.txt");
		ObjectInputStream ois =  new ObjectInputStream(fis);
//		Transfer2 tt1 = (Transfer2) ois.readObject();		//Oder of the object extraction must be siumilar to insertion of objects. otherwise it will throw RE. ClassCastException:
		/*Transfer1 tt1 = (Transfer1) ois.readObject();
		Transfer2 tt2 = (Transfer2) ois.readObject();
		Transfer3 tt3 = (Transfer3) ois.readObject();*/
		
		//another way of accessing multiple objects
		Object o =  ois.readObject();
		if(o instanceof Transfer1){
			Transfer1 ot1 = new Transfer1();
			//or return the same object
		}
		else if(o instanceof Transfer2){
			Transfer2 ot2 = new Transfer2();
			//or return the same object
		}
		else{
			Transfer3 ot3 = new Transfer3();
			//or return the same object
		}
			
	}

}

class Transfer1 implements Serializable{
	int t1i = 10;
	int t1j = 20;
}
class Transfer2 implements Serializable{
	int t2i = 30;
	int t2j = 40;
}
class Transfer3 implements Serializable{
	int t3i = 50;
	int t3j = 60;
}
