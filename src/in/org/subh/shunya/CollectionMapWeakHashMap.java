package in.org.subh.shunya;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CollectionMapWeakHashMap {

	public static void main(String[] args) {
		System.out.println("Collection Map WeakHashMap Main");

		demo1();
		demo2();
	}
	
	static void demo2(){
		Map hashMap= new HashMap();
        Map weakHashMap = new WeakHashMap();

        String keyHashMap = new String("keyHashMap");
        String keyWeakHashMap = new String("keyWeakHashMap");
        String keyWeakHashMap1 = new String("keyWeakHashMap1");

        hashMap.put(keyHashMap, "helloHash");
        weakHashMap.put(keyWeakHashMap, "helloWeakHash");
        weakHashMap.put(keyWeakHashMap, "helloWeakHash");
        System.out.println("Before: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));

        keyHashMap = null;
        keyWeakHashMap = null;

        System.gc();  

        System.out.println("After: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
        System.out.println("After: Weak hash map value:"+weakHashMap.get("keyWeakHashMap1"));
	}
	
	static void demo1(){
		
		String ky = "k9";
//		Map mp = new HashMap();		//sort lived object
		Map mp = new WeakHashMap();		//sort lived object
		mp.put("k1", "subh");
		mp.put(ky, "subh2");			//whenever key becomes null then corresponding object automatically gc.
		mp.put("k4", "subh3");
		System.out.println("mp "+mp);
		ky = null;						//this key will be claimed by gc
		System.gc();
		System.out.println("mp "+mp);
		
		/*WeakCity wc = new WeakCity("city1","Pak");
		Map mp = new HashMap();
//		Map mp = new WeakHashMap();
		mp.put(wc, wc.getCountry());
		System.out.println(" wc "+mp);
		wc = null;
		System.gc();
		System.out.println(" wc "+mp);*/
	}
}

class WeakCity{
	private String name;
	private String country;
	
	public WeakCity(String name, String country) {
		this.name = name;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}