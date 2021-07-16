package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 *
 *call by Method
 *
 */

interface Parser {

	String parse(String str);
}
class StringParser{
	
	String convert(String str){
//	static String convert(String str){
		
		if(str.length()>=3)
			str = str.toUpperCase();
		else
			str = str.toLowerCase();
		
		return str;
	}
}

class MyPrinter{
	
	public void print(String str, Parser p){
		str = p.parse(str);
		System.out.println(str);
	}
	
}
public class C8MethodReference {

	static final Logger logger = Logger.getLogger(C8MethodReference.class);

	public static void main(String[] args) {

		/*List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
       for(String s : list){
    	   System.out.println(s);
       }
        
        list.forEach((n)->System.out.println(n) );*/
		
		
		List<Integer> values = Arrays.asList(2, 4, 0, 6, 7, 6, 1, 3, 65, 8);
//		values.forEach(logger::info); 
//		values.forEach(System.out::println); 	//Method Reference (call by Method)
		
		String str = "subhash";
		MyPrinter mp = new MyPrinter();
		
		/*mp.print(str, new Parser(){			//Anonymous Implementation
			@Override
			public String parse(String str) {
				return StringParser.convert(str);
			}
		});*/
		
		StringParser sp = new StringParser();
		
//		mp.print(str, ((String s)  -> {return StringParser.convert(s);}));	//Lambda Expression Static Implementation 1
//		mp.print(str, ((String s)  -> StringParser.convert(s)));	//Lambda Expression Static Implementation 2
//		mp.print(str, (s  -> StringParser.convert(s)));	//Lambda Expression Static Implementation 3
//		mp.print(str, (s  -> sp.convert(s)));	//Lambda Expression Implementation 4 if method is not static then use object
		
		
//		mp.print(str, (StringParser::convert));	//Method Reference Implementation 1
//		mp.print(str, StringParser::convert);	//Method Reference Implementation 2
//		mp.print(str, sp::convert);	//Method Reference Implementation 3 if method is not static then use object and if method is static then it will throw CE
		
//		staticMethodRef();
//		instanceMethodRef();
//		instanceMethodRef2();
		methodReferenceType();
	}
	
	static void methodReferenceType() {

		List<Integer> integers = Arrays.asList(1,12,433,5);
		
//		1. Method reference to static method – Class::staticMethodName
		Optional<Integer> max = integers.stream().reduce( Math::max ); 
//		max.ifPresent(value -> System.out.println(value)); 
		
		
//		2. Method reference to instance method from instance – ClassInstance::instanceMethodName        
		Optional<Integer> max2 = integers.stream().reduce( Math::max ); 
//		max2.ifPresent( System.out::println ); 
		
//		3. Method reference to instance method from class type – Class::instanceMethodName
		List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
		 
		List<String> sorted = strings.stream()
				.sorted((s1, s2) -> s1.compareTo(s2))
				.collect(Collectors.toList());
//		System.out.println("sorted=>"+sorted);
		 
		List<String> sortedAlt = strings.stream()
		        .sorted(String::compareTo)
		        .collect(Collectors.toList());
//		System.out.println("sortedAlt=>"+sortedAlt);
		
//		4. Reference to constructor – Class::new
		List<Integer> intgrs = IntStream.range(1, 100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new ));
//		System.out.println("intgrs=>"+intgrs);
 
		Optional<Integer> max4 = intgrs.stream().reduce(Math::max); 
//		max4.ifPresent(System.out::println); 
		
		
		//Testing Collectors.toCollection() method
		/*
		 * toList(), and toSet() methods of the Collectors class. Both methods return a
		 * Collector to collect the input elements into a new list or a Set, but doesn’t
		 * offer any guarantee on the type of the Collection returned. For instance,
		 * Collectors.toList() method can return an ArrayList or a LinkedList or any
		 * other implementation of the List interface.
		 * 
		 * To get the desired Collection, we can use the toCollection() method provided by the Collectors class.
		 */
		List<Integer> aryLst = new LinkedList<>();
		List<Integer> rngVal = IntStream.range(1, 100)
                .boxed()
                .collect(Collectors.toCollection(()->aryLst));
		System.out.println("toCollection=>"+rngVal);
	}
	
	/**
	 * Method reference work with functional interface. 
	 * While implementing if method is calling other method then we can implement method reference
	 */
	static void staticMethodRef(){  

		//No Arguments
		Sayablee sy = new Sayablee(){
			@Override
			public void say() {
				saySomething();
			}
		};
//		sy.say();
		
		Sayablee sy1 = () -> { saySomething();};		//Lambda Expression
//		sy1.say();
		
		Sayablee sy2 = C8MethodReference::saySomething;	//Method Reference
		sy2.say();
		
		
		//Arguments
		/*Sayablee sy11 = new Sayablee(){
			@Override
			public void say() {
				saySomething();
			}
		};
//		sy11.say();
		
		Sayablee sy12 = () -> { saySomething();};		//Lambda Expression
//		sy12.say();
		
		Sayablee sy21 = C8MethodReference::saySomething;	//Method Reference
		sy21.say();*/
	}
	
	static void instanceMethodRef(){  

		C8MethodReference mr = new C8MethodReference();
		
		Sayablee sy = new Sayablee(){
			@Override
			public void say() {
				mr.saySomethingInst();
			}
		};
//		sy.say();
		
		Sayablee sy1 = () -> { mr.saySomethingInst();};		//Lambda Expression
//		sy1.say();
		
		Sayablee sy2 = mr::saySomethingInst;	//Method Reference
		sy2.say();
	}
	
	static void instanceMethodRef2(){  

		C8MethodReference mr = new C8MethodReference();
		
		//Way 1
		Thread td = new Thread(){
			
			public void run(){
				System.out.println("helloooooooooo");
			}
		};
//		td.run();
		
		Thread td1 = new Thread(() -> {System.out.println("hellooooooooooo");});
//		td.run();
		
		//Way 2
		Thread td3 = new Thread(){
			
			public void run(){
				System.out.println("Hello, runnnnnnn."); 
				mr.saySomethingInst();
			}
		};
//		td3.run();
		
		Thread td4 = new Thread(() -> {mr.saySomethingInst();});
//		td4.run();

		Thread td5 = new Thread(mr::saySomethingInst);
		td5.run();
	}
	
	static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }
	
	static void saySomething(String str){  
        System.out.println("Hello, this is static method. "+str);  
    }
	
	void saySomethingInst(){  
        System.out.println("Hello, this is instance method.");  
    }
}


interface Sayablee{  
    void say();  
}  