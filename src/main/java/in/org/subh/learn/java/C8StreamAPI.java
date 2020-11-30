package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 *
 *
 */

public class C8StreamAPI {

	static final Logger logger = Logger.getLogger(C8StreamAPI.class);

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();  
		list.add("ankit");  
		list.add("mayank");  
		list.add("irfan");  
		list.add("jai");  
		/*for(String s : list){
			System.out.println(s);
		}*/
        
//      list.forEach((n)->System.out.println(n) );
		list.stream()
		.filter(n -> n.startsWith("a"));
//		.forEach(n -> System.out.println(n));
		
		List<Integer> values = new ArrayList(Arrays.asList(2, 4, 0, 6, 7, 6, 1, 3, 65, 8));
		
		//Basice element traversing
//		values.stream()
//		.forEach(n -> System.out.println(n));
		
		//filter even or odd
//		values.stream()
//		.filter(n -> n%2==0)				
//		.forEach(n -> System.out.println(n));		//FI(Consumer) is being used
		
		//Copy even number to new collection
		List ls2 = values.stream()
				.filter(n -> n%2==0)			//FI(Predict) is being used 
				.collect(Collectors.toList());
//		System.out.println(ls2);
		
		
		//Mapping each value with some value
		List ls3 = values.stream()
				.map(n -> n*2)				//FI(Fuction) is being used 
				.collect(Collectors.toList());
//		System.out.println(ls3);
		
		//count
		long ls4 = values.stream()
				.filter(n -> n%2==0).count();
//		System.out.println(ls4);
		
		//sorting DNSO
//		values.stream().sorted().forEach(n -> System.out.println(n));
//		System.out.println(ls4);
		
		//sorting Customised based on comparator
//		values.stream()
//		.sorted((i1, i2) -> -i1.compareTo(i2))
//		.forEach(n -> System.out.println(n));
//		System.out.println(ls4);
		
		//find minimum value
//		Optional<Integer> mn = values.stream().min((i1, i2) -> -i1.compareTo(i2));
//		System.out.println(mn.get());
		int mn1 = values.stream().min((i1, i2) -> i1.compareTo(i2)).get();
//		System.out.println(mn1);
		
		//find max value
		int mx = values.stream().max((i1, i2) -> i1.compareTo(i2)).get();
//		System.out.println(mx);
		
		//copy stream elements to Array Approach 1
		Object ary[] = values.stream().toArray();
//		System.out.println(ary[0]);

		//copy stream elements to Array Approach 2 (Need to understand)
//		Integer ary1[] = values.stream().toArray(Integer[]::new);
		Integer ary1[] = values.stream().toArray(n -> new Integer[n]);
//		for(Object it : ary1)
//			System.out.println(it);
	
		//apply stream concept for any group of values
		Stream<Integer> stm = Stream.of(9,99,999,9999,10);
//		stm.forEach(System.out::println);
		
		//apply stream concept for any array
		Double ar[] = {2.4, 6.7, 6.1, 3.65, 8.0};
		Stream<Double> stm1 = Stream.of(ar);
		stm1.forEach(System.out::println);
		
		//Concatenate/join collection values using Stream
		String cnctVal = list != null ? list.stream().collect(Collectors.joining(",")) : "";
		System.out.println(cnctVal);
		
		
		List<Product> productsList = new ArrayList<Product>();  
        productsList.add(new Product(1,"HP1","HP Laptop",25000f));  
        productsList.add(new Product(2,"Del1","Dell Laptop",30000f));  
        productsList.add(new Product(3,"Len1","Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony1","Sony Laptop",28000f));  
        productsList.add(new Product(5,"App1","Apple Laptop",90000f));
        
        //single condition filter
        Product match = productsList.parallelStream().filter(prd -> prd.getPrice() == 30000f).findAny().get();
        System.out.println(match.name);
        
        String respResult = "Sony1, HP1";
        List<String> vll = new ArrayList<>();
        
        //forEach multi condition traditional way
        for(Product gmm : productsList) {
        	if(respResult.contains(gmm.code)) {
        		vll.add(gmm.name);
        	}
        }
        System.out.println("Traditional "+String.join(",", vll));
        vll.clear();
        
        //forEach multi conditional 
        productsList.forEach(
        			v -> {
        				if(respResult.contains(v.code)) {
        	        		vll.add(v.name);
        	        	}
        			}
        		);
        System.out.println("Multiline "+String.join(",", vll));
        vll.clear();
        
        //forEach multi conditional single line 
        productsList.stream().filter(v -> Arrays.asList(respResult.split(",")).contains(v.code)).forEach(v -> vll.add(v.name));
        System.out.println("Single Line "+String.join(",", vll));
        
        //Convert list of objects from list of Strings 
        List<String> listString = new ArrayList<>();	//traditional way
        for (Product prd : productsList) {
        	listString.add(prd.name);
        }
        listString.clear();
        
        //Java 8 way convert Object collection to String collection
        listString = productsList.stream().map(Product::getName).collect(Collectors.toList());
        System.out.println(listString);
        
        //Sort in Custom Object in single line
        List<String> sgm = productsList.stream().map(Product::getCode).sorted().collect(Collectors.toList());
        System.out.println(sgm);
        
        //Sort Complete Custom Object
        List<Product> prd = productsList.stream().sorted(Comparator.comparing(Product::getCode)).collect(Collectors.toList());
        System.out.println(prd);

        //Sort Complete Custom Object Reverse
        List<Product> prd1 = productsList.stream().sorted(Comparator.comparing(Product::getCode).reversed()).collect(Collectors.toList());
        System.out.println(prd1);
        
        //String operations
        List<String> list1=new ArrayList<>();  
        list1.add("name ");  
        list1.add("day");  
        list1.add("value ");  
        list1.add("leaf");
        list1 = list1.stream().map(String::trim).collect(Collectors.toList());
        System.out.println(list1);
        
        //TODO
//        List<Users> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Users.class));
//		return result.stream().map(sc->{
//			GenericModel genericModel = new GenericModel();
//			// Id
//			genericModel.setId(sc.getUserID());
//			// Name
//			genericModel.setName(sc.getFullname());
//			
//			return genericModel;
//		}).collect(Collectors.toList());
	}
}

class Product{  
    int id;  
    String code;  
    String name;  
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
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
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}
}  



