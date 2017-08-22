package in.org.subh.shunya;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {
	
	private static final String FILENAME = "filename_write_test.txt";

	public static void main(String[] args) {

		traditionalWriter();
		jdk7Writer();
		
	}
	
	static void traditionalWriter(){
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			String content = "This is the content to write into file\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {
			System.out.println("IO Exception "+e);
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				System.out.println("IO Exception "+ex);
			}
		}
	}
	
	static void jdk7Writer(){
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			String content = "This is the content to write into file\n";
			bw.write(content);

			// no need to close it.
			//bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			System.out.println("IO Exception "+e);
		}
	}
}
