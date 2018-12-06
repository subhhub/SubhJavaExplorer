package org.subh.shunya;

import java.io.IOException;

public class InheritanceRuntime {

	public static void main(String[] args) throws IOException {
		
		 Base b = new Derived();;
		 b.show();
		 b.showStat();		//when a function is static, runtime polymorphism doesn’t happen
	}  
}


class Base {
    public void show() {
       System.out.println("Base::show() called");
    }
    
    public static void showStat() {
        System.out.println("Static Base::show() called");
     }
}
  
class Derived extends Base {
    public void show() {
		System.out.println("Derived::show() called");
	}
    
    public static void showStat() {
        System.out.println("Static Derived::show() called");
     }
}
