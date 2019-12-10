package in.org.subh.learn.ocjp6;
import java.io.*;
import java.text.DateFormat;

public class Question18 {
	public static void main(String[] args) {
		File dir = new File("dir");
		dir.mkdir();
		File f1 = new File(dir, "f1.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			;
		}
		File newDir = new File("newDir");
		dir.renameTo(newDir);
		
		System.out.println("ok");
		
		
		Integer i = 12;
		int j = 12;
		System.out.println("It is " + (j==i) + " that j==i.");
	}
}