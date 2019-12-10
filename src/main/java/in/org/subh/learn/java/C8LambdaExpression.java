package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.List;

public class C8LambdaExpression {

	public static void main(String[] args) {

//		funcationalInterfaceImplOld();
		funcationalInterfaceImplLambda();

	}

	static void funcationalInterfaceImplOld() {

		final int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};

		d.draw();
	}

	static void funcationalInterfaceImplLambda() {

		int width = 10;

		// with lambda
		/*Drawable d2 = () -> { 
			System.out.println("with lambda Drawing " + width);
		};
		d2.draw();*/
		
		// with lambda arguments
//		DrawableArg d3 = (name) -> {
		/*DrawableArg d3 = name -> {
			System.out.println("Argument Lambda Expression "+ name);
		};
		d3.draw("subh");*/
		
        // Multiple parameters in lambda expression  with single expression 
//        Addable ad1=(a,b)->(a+b);  
//        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
//        Addable ad2=(int a,int b)->(a+b);  
//        System.out.println(ad2.add(100,200));  
        
     // Lambda expression with return keyword.    
        /*Addable ad3=(int a,int b)->{ 
        					int c = a + b;
                            return c;   
                            };  
        System.out.println(ad3.add(100,200));*/
        
        //Lambda Expression Example: Foreach Loop
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  

       for(String s : list){
    	   System.out.println(s);
       }
        
        list.forEach(  
            (n)->System.out.println(n)  
        );

	}
}

@FunctionalInterface		//Optional if a interface has only one abstract method then it called functional interface
interface Drawable {
	public void draw();
}

interface DrawableArg {
	public void draw(String str);
}

interface Addable{  
    int add(int a,int b);  
}  


