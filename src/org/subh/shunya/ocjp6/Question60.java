package org.subh.shunya.ocjp6;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Question60 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat();
		Date dt = new Date();
	}
	
	
	public static boolean doesFileExist(String[] diretories, String fileName){
		
		String path = "";
		for(String dir: diretories){
			
			path = path+File.separator+dir;
			
		}
		File f = new File(path, fileName);
		return f.exists();
	}
}
