package in.org.subh.shunya;

public class CodeEqualsAndSymbolEqual extends Object {

	public static void main(String[] args) {

		String fstr= new String("Javatutorials");
		String sstr= new String("Javatutorials"); 
		 
		System.out.println(fstr.equals(sstr));
		System.out.println(fstr==sstr);
		 
		System.out.println(fstr.hashCode());
		System.out.println(sstr.hashCode());
		
		StringBuffer fstr1= new StringBuffer("Javatutorials");
		StringBuffer sstr1= new StringBuffer("Javatutorials"); 
		
		fstr1.append("subh");
		
		System.out.println("String And StringBuffer Comparison");
		System.out.println(fstr1.equals(sstr1));
		System.out.println(fstr1==sstr1);
//		System.out.println(fstr==sstr1);			//CE: Incompatible need same type of reference.
		System.out.println(fstr.equals(sstr1)); 
		System.out.println(fstr1==null);		//always false for any kind of object
		System.out.println(fstr.equals(null)); 		//always false for any kind of object
		
		
		System.out.println(fstr1.hashCode());
		System.out.println(sstr1.hashCode());
		
		C1 c = new C1();
		C1 c1 = new C1();
		
		System.out.println(c == c1);
		
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
	}
}

class C1{
	
	/*public int hashCode() {
		return 100;
	}*/
}
