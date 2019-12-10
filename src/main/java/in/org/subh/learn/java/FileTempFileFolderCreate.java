package in.org.subh.learn.java;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import in.org.subh.learn.java.one.CodeTest1;

public class FileTempFileFolderCreate {

	private static final String FILEANME = "temp_config.xml";
	private static final String TEMP_DIR = "src/test/java/com/ericsson/datamigration/files";
	private static final String TEMP_DEL_DIR = "src/test";
	
private static final Logger LOGGER = Logger.getLogger(CodeTest1.class.getName());
	
	public static void main(String[] args) throws IOException {
		
		final String file = TEMP_DIR.concat(File.separator).concat(FILEANME);
		LOGGER.log(Level.INFO, "file "+ file);
		
		File dir = new File(FileTempFileFolderCreate.TEMP_DIR);
	    
	    if (!dir.exists()) {
            if (dir.mkdirs()) {
            	LOGGER.log(Level.INFO, "Directory is created!");
            } else {
            	LOGGER.log(Level.WARNING, "Failed to create directory!");
            }
        }
	    
	    /*if (dir.exists()) {
	    	if(dir.delete())
	    	  LOGGER.log(Level.INFO, "Directory is deleted!");
	    	else
	    		LOGGER.log(Level.WARNING, "Directory is not deleted!");
	    		
	    }*/
	    
//	    recursiveDelete(new File(FileTempFileFolderCreate.TEMP_DEL_DIR));
	}  
	
	/**
	 * Delete all the files and sub folders
	 * 
	 * @param file
	 */
	public static void recursiveDelete(File file) {
	
		if (!file.exists())
	        return;
	     
	    //if directory, go inside and call recursively
	    if (file.isDirectory()) {
	        for (File f : file.listFiles()) {
	            //call recursively
	            recursiveDelete(f);
	        }
	    }
	    //call delete to delete files and empty directory
	    if(file.delete())
	    	LOGGER.log(Level.INFO, "Directory is deleted!");
	    else
	    	LOGGER.log(Level.WARNING, "Directory is not deleted!");
	    
	}
}
