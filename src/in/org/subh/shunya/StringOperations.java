package in.org.subh.shunya;

public class StringOperations {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		//StringBuilder sbd = new StringBuilder("subh");
		
//		String s = new String ("Hello");
//		String s3 = new String ("Hello");
//		String s4 = "Hello";
//		System.out.println("s "+s.hashCode());
//		System.out.println("s3 "+s3.hashCode());
//		System.out.println("s4 "+s4.hashCode());
//		System.out.println(s==s3);		//false
		
//		String s5 = s;
//		System.out.println(s5 == s);		//true
		
		/*String s1 = "test1";//+"test3";
		String s2 = "test2";
		System.out.println("s1 "+s1.hashCode());
		System.out.println("s2 "+s2.hashCode());
	
		int x = 2;
		x =+ 2;
		System.out.println(x);*/
		
//		StringConstantPool();
//		StringConstantPool2();
//		InternExample();
		
		//Remove All Vowels From String Using replaceAll() Method 
		String inputString = "gotthejob";
        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
        System.out.println("The string without vowels...");
        System.out.println(newInputString);
	}
	
	static void StringConstantPool(){
		 String s1 = "Arul"; //case 1
		 String s2 = "Arul"; //case 2

		 if(s1 == s2) 
			 System.out.println("references are equal"); //Prints equal.
		 
		 String n1 = new String("Arul");
		 String n2 = new String("Arul");
		 
		 if(n1 == n2) 
			 System.out.println("equal"); //No output.
		 else
			 System.out.println("references are not equal");
	}
	
	static void StringConstantPool2(){
		 String s1 = new String("Job");		//2 objects (Heap((Job)) + SCP(Job))
		 s1.concat("Cisco");				//2 Objects (SCP(Cisco) + Heap(JobCisco))
		 String s2 = s1.concat("JPMC");		//2 Objects (Heap(JobJPMC) + SCP(JPMC))
		 s1 = s1.concat("91+");				//2 Objects (SCP(91+) + Heap(Job91+))
		 
		 System.out.println("s1 "+s1);
		 System.out.println("s2 "+s2);
	}

	static void InternExample(){
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same  
	}
}
