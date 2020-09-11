package in.org.subh.learn.java;

import java.util.Arrays;
import java.util.List;

interface LA{
	
//	void show();
	void show(int i);
}
/*class CLA implements LA{
	public void show(){
		System.out.println("hello");
	}
}*/

abstract class AC{
	abstract void show();
}

public class C8LambdaExplaination {

	public static void main(String[] args) {

//		LA la =  new CLA();		//interface impleneation with class
//		la.show();

		/*LA la2 = new LA(){			//interface implementation Anonymous inner class
			@Override
			public void show() {
				System.out.println("hello");
			}
		};
		la2.show();*/

//		LA la2 = () -> { System.out.println("heelolo");};	//interface implementation using Lembda Expresion with no arguments
//		la2.show();

		// or if we have only liner code then no need to write curly bracket
//		LA la3 = (int i ) -> System.out.println("heelolo");	//interface implementation using Lembda Expresion without curly braces for single statment
//		la3.show(6);

		// or
//		LA la4 = ( i ) -> System.out.println("heelolo " + i);	//interface implementation using Lembda Expresion without data type and curly braces
//		la4.show(6);

		// or 
		LA la5 = i -> System.out.println("heelolo " + i);	//interface implementation using Lembda Expresion with single argument
		la5.show(6);
		
//		forEachConsumerMethodExplained();
		
		//Abstract class anonymous inner class implementation
		AC ac = new AC(){
			@Override
			void show() {
				System.out.println("Print Something");
			}
		};
		ac.show();
		
		//CE: The target type of this expression must be a functional interface. LE only work with functional interfaces
//		AC ac1 = () -> {System.out.println("Print Something");};	
	}
	
	static void forEachConsumerMethodExplained(){
		
		List<Integer> values = Arrays.asList(2, 4, 0, 6, 7, 6, 1, 3, 65, 8);
				
//		values.forEach(i -> System.out.println(i));
		
		//using traditional Anonymous class implementation
		/*Consumer<Integer> cn = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		cn.accept(10);*/
//		values.forEach(cn);
		
		//or using lembd expression evalution step by step
//		Consumer<Integer> cn = (Integer t)  -> { System.out.println(t); }; 	//Implementation 1
//		Consumer<Integer> cn = (Integer t)  -> System.out.println(t);		 	//Implementation 2
//		Consumer<Integer> cn = (t)  -> System.out.println(t);				 	//Implementation 3
//		Consumer<Integer> cn = t  -> System.out.println(t);					 	//Implementation 4
//		values.forEach(cn);
		values.forEach(t  -> System.out.println(t));
		
	}
}
