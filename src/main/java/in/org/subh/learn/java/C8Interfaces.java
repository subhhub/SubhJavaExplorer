package in.org.subh.learn.java;

import org.apache.log4j.Logger;

public class C8Interfaces {

	static final Logger logger = Logger.getLogger(C8Interfaces.class);
	
	public static void main(String[] args) {
		
		System.out.println("Hello Java 8 Interface");
		
//		DiamondI1 di1 = new DiamondC();
		DiamondI2 di1 = new DiamondC();
//		DiamondC di1 = new DiamondC();
		
//		String str = di1.show2();
//		logger.info(str);
		
//		DiamondF df = new DiamondF();
//		String str2 = df.show4();
//		logger.info(str2);
		
//		logger.info(DefineMethodInterace.devideSep());
		
		DefineMethodInterace dmi  = (a, b) -> (a + b);
	}
}

@FunctionalInterface			//Functional Interface will work with one abstract
interface DefineMethodInterace{  
	
    int addSep(int a,int b); 
    
    default String subSep(){					//multiple default methods are allowed with different names
    	return "Defined method inside a interface example";
    }

    default String subSep2(){					//multiple default methods are allowed with different names
    	devideSep2();						//static method can be invoked within static and default methods
    	return "Defined method 2 inside a interface example";
    }
    
    static String devideSep(){					//multiple static methods are allowed with different names
    	return "static method inside a interface example";
    }

    static String devideSep2(){					//multiple static methods are allowed with different names
    	return "static method 2 inside a interface example";
    }
    
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);
}

class DMIImpl implements DefineMethodInterace{
	@Override
	public int addSep(int a, int b) {
		return 10;
	}
}

//==========================Ambiguity in Java8 ==============================
interface DiamondI1{
	
	default String show(){
    	return "Defined method inside a DiamondI1 interface";
    }
}
interface DiamondI2{
	
	/*default String show(){	//Duplicate default methods named show with the parameters () and () are inherited from the types DiamondI2 and DiamondI1
    	return "Defined method inside a DiamondI2 interface";
    }*/
	
	default String show2(){
    	return "Defined method inside a DiamondI2 interface";
    }
}
class DiamondC implements DiamondI1, DiamondI2{	//If we have define different method name then no need to redefine in class

	/*@Override
	public String show() {		//to remove the ambiguity we can override the show method if both interface has same method.
//		DiamondI2.super.show();			//It will call the DiamondI2 show method and ignore the other stuff.
		return "method inside a DiamondC class";
	}*/
	
	
}
//=================================================================================

interface DiamondI3{
	
	default String show3(){
    	return "Defined method inside a DiamondI2 interface";
    }
}
class DiamondD implements DiamondI3{ //If we have default method inside interface then we don't need to redefine in class

}

//==========================Third Rule in Java8 ==============================
/*If a class has inherited class and interface and both are having the same method 
 * then it will give the priority to normal method. 
 * Because normal method has highest priority compare to default method.
*/
interface DiamondI4{
	default String show4(){
    	return "Defined method inside a DiamondI4 interface";
    }
}
class DiamondE{
	public String show4(){						//must be public if it has inherited along with interface because interface has default access specifier public and abstract
    	return "method inside a DiamondE class";
    }
}
class DiamondF extends DiamondE implements DiamondI4{

}

//==========================Object class method in Java8 ==============================

interface DiamondI5{
	
	/*default boolean equals(Object obj){	//A default method cannot override a method from java.lang.Object 
		return true;
	}*/
}

//==========================Invalid Functional Interface Java8 ==============================
interface sayable{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
//interface Doable extends sayable{	// Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
interface Doable{  
    void doIt();  
}  