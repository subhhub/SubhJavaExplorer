package in.org.subh.shunya;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.apache.commons.io.filefilter.RegexFileFilter;

/**
 * @author esubkew
 * 
 * List all the files in a directory based on a regex
 *
 */
public class RegexFileFilterTest {

public static void main(String[] args) throws IOException {
		
		String path = "C:\\Subh\\CSILab\\Projects\\UDM\\Tool\\UDC_HLR_AUC\\dm_udc_massive_changes_customizations\\dev\\src\\config\\";
	
//		File directory = new File(".");
		File directory = new File(path);

		File[] files = directory.listFiles();
//		System.out.println("All files and directories:");
//		displayFiles(files);

		String pattern = "A3A8IND.*.csv";
		System.out.println("\nFiles that match regular expression: " + pattern);
		FileFilter filter = new RegexFileFilter(pattern);
		files = directory.listFiles(filter);
//		displayFiles(files);
		
		System.out.println(files.length);

		for (File file : files) {
			System.out.println(file.getName());
		}
		
	}  
	public static void displayFiles(File[] files) {
		for (File file : files) {
			System.out.println(file.getName());
		}
	}

}
