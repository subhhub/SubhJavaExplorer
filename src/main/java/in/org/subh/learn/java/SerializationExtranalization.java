package in.org.subh.learn.java;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationExtranalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("SerializationExtranilaztion Multiple Objects Main");

		ExternalizablenDemo ed = new ExternalizablenDemo("subhash", 10, 11);
		FileOutputStream fos = new FileOutputStream("externaFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ed);
		
		FileInputStream fis = new FileInputStream("externaFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizablenDemo edn = (ExternalizablenDemo) ois.readObject();
		
		System.out.println("edn "+edn.s);
		System.out.println("edn "+edn.i);
		System.out.println("edn "+edn.j);
	}

}

class ExternalizablenDemo implements Externalizable{
	
	/*String s;
	int i;
	int j;*/
	
	transient String s;			//transient doesnt work inside externalization
	transient int i;
	transient int j;
	
	public ExternalizablenDemo() {
		System.out.println("Externalizable Constructor");
	}
	public ExternalizablenDemo(String ss, int ii, int jj) {
		this.s = ss;
		this.i = ii;
		this.j = jj;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = in.readInt();
		
	}
	
}
