package org.subh.shunya;

public class InterfaceTest{
	public static void main(String[] args) {

		InterfaceTestA a = null;
		 
        a.equals(null);
 
        int aa = a.hashCode();
        System.out.println(aa);		//RE: NullPointerException
        
        String ss = a.toString();		//RE: NullPointerException
        System.out.println(ss);
	}
}

abstract class Inter1{
	
}

//interface InterfaceTestA extends Inter1 {		//We cant : CE
interface InterfaceTestA {

	@Override
    public boolean equals(Object obj);
 
    @Override
    public int hashCode();
 
    @Override
    public String toString();
    
    abstract void test();
}

abstract interface Inter extends InterfaceTestA{
	
}