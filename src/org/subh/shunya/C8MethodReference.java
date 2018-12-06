package org.subh.shunya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
//		mp.print(str, ((String s)  -> {return StringParser.convert(s);}));	//Lembda Expression Implementation 1
//		mp.print(str, ((String s)  -> StringParser.convert(s)));	//Lembda Expression Implementation 2
//		mp.print(str, (s  -> StringParser.convert(s)));	//Lembda Expression Implementation 3
		mp.print(str, (s  -> sp.convert(s)));	//Lembda Expression Implementation 4 if method is not static then use object
		
		
//		mp.print(str, (StringParser::convert));	//Method Reference Implementation 1
//		mp.print(str, StringParser::convert);	//Method Reference Implementation 2
//		mp.print(str, sp::convert);	//Method Reference Implementation 3 if method is not static then use object and if method is static then it will throw CE
		
//		staticMethodRef();
//		instanceMethodRef();
		instanceMethodRef2();
	}
	
	/**
	 * Method reference work with functional interface. 
	 * While implementing if method is calling other method then we can implement method reference
	 */
	static void staticMethodRef(){  

		//No Arguments
		Sayable sy = new Sayable(){
			@Override
			public void say() {
				saySomething();
			}
		};
//		sy.say();
		
		Sayable sy1 = () -> { saySomething();};		//Lembda Expression
//		sy1.say();
		
		Sayable sy2 = C8MethodReference::saySomething;	//Method Reference
		sy2.say();
		
		
		//Arguments
		/*Sayable sy11 = new Sayable(){
			@Override
			public void say() {
				saySomething();
			}
		};
//		sy11.say();
		
		Sayable sy12 = () -> { saySomething();};		//Lembda Expression
//		sy12.say();
		
		Sayable sy21 = C8MethodReference::saySomething;	//Method Reference
		sy21.say();*/
	}
	
	static void instanceMethodRef(){  

		C8MethodReference mr = new C8MethodReference();
		
		Sayable sy = new Sayable(){
			@Override
			public void say() {
				mr.saySomethingInst();
			}
		};
//		sy.say();
		
		Sayable sy1 = () -> { mr.saySomethingInst();};		//Lembda Expression
//		sy1.say();
		
		Sayable sy2 = mr::saySomethingInst;	//Method Reference
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


interface Sayable{  
    void say();  
}  