package org.subh.shunya;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 * 
 * java 8 onward we can run main method inside interface becuase interface allows static methods
 *
 */
public interface C8InterfacesWithMain {

	Logger logger = Logger.getLogger(C8InterfacesWithMain.class);
	
	public static void main(String[] args) {
		
		logger.info("Main method inside Java 8 Interface");
		
		
	}
}

