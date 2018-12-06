package org.subh.shunya;

import org.apache.log4j.Logger;

public class C8Interfaces {

	static final Logger logger = Logger.getLogger(C8Interfaces.class);
	
	public static void main(String[] args) {
		
		logger.info("Hello Java 8 Interface");
		
//		DiamondI1 di1 = new DiamondC();
		DiamondI2 di1 = new DiamondC();
//		DiamondC di1 = new DiamondC();
		
		String str = di1.show2();
//		logger.info(str);
		
//		DiamondF df = new DiamondF();
//		String str2 = df.show4();
//		logger.info(str2);
		
//		logger.info(DefineMethodInterace.devideSep());
		
	}
}

@FunctionalInterface			//Functional Interface will work with one abstract
interface DefineMethodInterace{  
	
    int addSep(int a,int b); 
    
    default String subSep(){					//multiple default methods are allowed with different names
    	return "Defined method inside a interface example";
    }
    
    static String devideSep(){					//multiple static methods are allowed with different names
    	return "static method inside a interface example";
    }
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
	public String show() {		//to remove the ambibuity we can override the show method if both interface has same method.
//		DiamondI2.super.show();			//It will call the DiamondI2 show method and ignore the other stuff.
		return "method inside a DiamondC class";
	}*/
	
	
}
//==========================End Ambiguity in Java8 ==============================

interface DiamondI3{
	
	default String show3(){
    	return "Defined method inside a DiamondI2 interface";
    }
}
class DiamondD implements DiamondI3{ //If we have default method inside interface then we don't need to redefine in class

}

//==========================Third Rule in Java8 ==============================
/*If a class has interited class and interface and both are having the same method 
 * then it will give the priority to normal method. 
 * Because normal method has highest priority comapre to default method.
*/
interface DiamondI4{
	default String show4(){
    	return "Defined method inside a DiamondI4 interface";
    }
}
class DiamondE{
	public String show4(){						//must be public if it has interited along with interface becuase interface has default access specifier pubilc and abstract
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
