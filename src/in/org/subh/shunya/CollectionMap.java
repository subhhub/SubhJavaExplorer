package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionMap {

	public static void main(String[] args) {
		System.out.println("Map Main");
		
		Map tm=new TreeMap();  				//No Initial Capacity
		  tm.put(100,"Rahul2");  
		  tm.put(101,"Vijay");  
//		  tm.put(null,"Rahul");   
		  tm.put(102,"Rahul2");  
		  tm.put(102,"Rahul2");  		//duplicate key not allowed
		  tm.put(2,"Rahul2");  		//duplicate key not allowed
//		  tm.put(null,"Rahul420");   
//		  System.out.println(tm);
		
		  Map hm = new HashMap(2);
//		Map hm = new LinkedHashMap();		//Preserve the order
//		Map hm = new ConcurrentHashMap();

		System.out.println(hm.size());
		
		hm.put(108,"Rahul2"); 
		hm.put(100,"Rahul2"); 
		hm.put(101, "Vijay");
//		hm.put(null,"Rahul");  
		hm.put(102,null);  
		hm.put(102,"Rahul2");    		//duplicate key not allowed
//		hm.put(null,"Rahul420");   
		
		hm.remove(108);
		
//		System.out.println(hm.size());		//size 4 don't count null key

		System.out.println(hm.size());
		System.out.println(hm);
		
		/*Hashtable hm1=new Hashtable();  
		  hm1.put(100,"Rahul2");  
		  hm1.put(101,"Vijay");  
		  hm1.put(null,"Rahul");  		//RE. NullPointerException
		  hm1.put(555,null);    		//RE. NullPointerException
		  hm1.put(102,"Rahul2");  
		  System.out.println(hm1);*/
		  
		  /*Iterator entries = tm.entrySet().iterator();
		  while (entries.hasNext()) {
		      Map.Entry entry = (Map.Entry) entries.next();
		      Object key = entry.getKey();
		      String value = (String)entry.getValue();
		      System.out.println("Key = " + key + ", Value = " + value);
		  }*/
		  
		  /*Iterator cl = hm.values().iterator();
		  while (cl.hasNext()) {
		      System.out.println("Value = " + cl.next());
		  }*/
		  
		  /*Iterator ky = hm.keySet().iterator();
		  while (ky.hasNext()) {
		      System.out.println("Value = " + ky.next());
		  }*/
		
		/*Map<Integer, String> map = new HashMap<>();
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		//loop a Map
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer ky = entry.getKey();
			String vl = entry.getValue();
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}*/
		  
//		  convertMapToArrayList();
	}

	static void convertMapToArrayList(){

		//Creating a HashMap object
        HashMap<String, String> studentPerformanceMap = new HashMap<String, String>();
         
        //Adding elements to HashMap
        studentPerformanceMap.put("John", "Average");
        studentPerformanceMap.put("Rakesh", "Good");
        studentPerformanceMap.put("Prachi", "Very Good");
        studentPerformanceMap.put("Ivan", "Very Bad");
        studentPerformanceMap.put("Smith", "Very Good");
        studentPerformanceMap.put("Anjali", "Bad");
         
        //Getting Set of keys
        Set<String> keySet = studentPerformanceMap.keySet();
        //Creating an ArrayList of keys
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
        
        System.out.println("ArrayList Of Keys :");
        for (String key : listOfKeys) {
            System.out.println(key);
        }
        System.out.println("--------------------------");
         
        //Getting Collection of values
        Collection<String> values = studentPerformanceMap.values();
        //Creating an ArrayList of values
        ArrayList<String> listOfValues = new ArrayList<String>(values);
         
        System.out.println("ArrayList Of Values :");
        for (String value : listOfValues) {
            System.out.println(value);
        }
        System.out.println("--------------------------");
         
        //Getting the Set of entries
        Set<Entry<String, String>> entrySet = studentPerformanceMap.entrySet();
        //Creating an ArrayList Of Entry objects
        ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String,String>>(entrySet);
         
        System.out.println("ArrayList of Key-Values :");
        for (Entry<String, String> entry : listOfEntry) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
	}
}
