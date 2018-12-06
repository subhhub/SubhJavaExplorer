package org.subh.shunya;

import java.util.ArrayList;
import java.util.Arrays;
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
	}
}



