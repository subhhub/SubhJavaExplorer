package in.org.subh.shunya;

import java.util.Properties;
import java.util.Set;

public class CollectionProperties {

	public static void main(String[] args) {
		Properties capitals = new Properties();
	      Set states;
	      String str;
	      
	      capitals.put("Illinois", "Springfield");
	      capitals.put("Missouri", "Jefferson City");
	      capitals.put("Washington", "Olympia");
	      capitals.put("California", "Sacramento");
	      capitals.put("Indiana", "Indianapolis");
	      
	      System.out.println("capitals "+capitals);
	}
	
}
