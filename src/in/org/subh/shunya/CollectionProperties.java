package in.org.subh.shunya;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionProperties {

	public static void main(String[] args) throws IOException {

		// readProperties();
		// readSystemProperties();
		writeProperties();
	}

	static void readProperties() throws IOException {
		FileReader reader = new FileReader("src/db.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}

	static void readSystemProperties() throws IOException {
		Properties p = System.getProperties();
		Set set = p.entrySet();

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

	static void writeProperties() throws IOException {

		/*Properties capitals = new Properties();
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		System.out.println("capitals " + capitals);*/

		Properties p = new Properties();
		p.setProperty("name", "Subh kewat");
		p.setProperty("email", "subh@gmailt.com");

		p.store(new FileWriter("src/info.properties"), "Javatpoint Properties Example");
		
		// save properties to project root folder
//		p.store(output, null);

	}

}
