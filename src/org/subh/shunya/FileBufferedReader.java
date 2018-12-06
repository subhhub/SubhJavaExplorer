package org.subh.shunya;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReader {

	private static final String FILENAME = "externaFile.txt";

	public static void main(String[] args) {

		traditionalReader();
		jdk7Reader();
	}
	
	static void traditionalReader(){
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			System.out.println("IO Exception "+e);
		} finally {

			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();

			} catch (IOException ex) {
				System.out.println("IO Exception "+ex);
			}
		}
	}
	
	static void jdk7Reader(){
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
