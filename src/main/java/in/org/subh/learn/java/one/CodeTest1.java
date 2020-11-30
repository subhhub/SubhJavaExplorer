package in.org.subh.learn.java.one;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.codehaus.groovy.util.StringUtil;

import groovyjarjarantlr.StringUtils;

/**
 * Class for Random Testing.
 * 
 * @author kewats
 *
 */
public class CodeTest1 {
	
	public static final String CACHE_KEY_SEPARATOR = "_";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException  {

		Map mp = new HashMap<>();
		
		List<Product> productsList = new ArrayList<Product>();  
        productsList.add(new Product(1,"HP1","HP Laptop",25000f));  
        productsList.add(new Product(2,"Del1","Dell Laptop",30000f));  
        productsList.add(new Product(3,"Len1","Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony1","Sony Laptop",28000f));  
        productsList.add(new Product(5,"App1","Apple Laptop",90000f));  
        List<Product> pricesList =  productsList.parallelStream()
        		.filter(p ->p.price == 30000)   // filtering price  
                    .collect(Collectors.toList());  
        pricesList.forEach(v -> System.out.println(v.name));  

//        String val = "Sony1";
//        String val = "";
        String val = null;
        
//      Product match = productsList.stream().filter(prd -> prd.getCode().equals(val)).findAny().orElseGet(null);
//        Optional<Product> match = productsList.stream().filter(prd -> prd.getCode().equals(val)).findAny();
//        String vl = match.isPresent()?match.get().getCode():"No Value";

        List<Integer> list=new ArrayList<>();  
        list.add(10);  
        list.add(43);  
        list.add(21);  
        list.add(87);  
        
        List<String> val1 = list.stream().map(vl -> String.valueOf(vl)).collect(Collectors.toList());
//        System.out.println(val1 );

        
        List<String> list1=new ArrayList<>();  
        list1.add("name ");  
        list1.add("day");  
        list1.add("value ");  
        list1.add("leaf");
        list1 = list1.stream().map(String::trim).collect(Collectors.toList());
        System.out.println(list1);
        
//        System.out.println(Arrays.asList("reportId,reportTA".split(",", -1)).contains("reportId"));
        
	}
	
	 public static String getLookupKey(String... lookupKeys)
	  {
	    StringBuilder innerKey = new StringBuilder();

	    for (int i = 0; i < lookupKeys.length; i++)
	    {
	      innerKey.append(lookupKeys[i]);
	      if (i < lookupKeys.length - 1)
	      {
	        innerKey.append(CACHE_KEY_SEPARATOR);
	      }
	    }

	    return innerKey.toString();
	  }
}

class respDTO{
	
	String partialID;

	public String getPartialID() {
		return partialID;
	}

	public void setPartialID(String partialID) {
		this.partialID = partialID;
	}
}

class Product{  
    int id;  
    String code;  
    List<String> ownr;
    public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	String name;  
    float price;  
    public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String code, String name, float price) {  
        this.id = id;  
        this.code = code;  
        this.name = name;  
        this.price = price;  
    }
	public List<String> getOwnr() {
		return ownr;
	}
	public void setOwnr(List<String> ownr) {
		this.ownr = ownr;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}  
	
	
}  
