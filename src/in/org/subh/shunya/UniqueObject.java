package in.org.subh.shunya;

public class UniqueObject {
	
	static
	{
	System.out.println("Inside static");
	}
	{
	System.out.println("Inside init");
	}


	public static void main(String[] args) {
		
		System.out.println("Main");
		new UniqueObject();
		
		Unque1 uq = new Unque1();
		System.out.println(uq.hashCode());

		Unque1 uq1 =  new Unque1();
		
		System.out.println(uq1.hashCode());
		
		System.out.println(uq.equals(uq1));
		
	}
}

class Unque1{
	private final String name = "suhb";

	/*  public Unque1(String name) {
	    if (name == null) {
	      name = ""; //or exception if you like
	    }
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }*/

	  @Override
	  public boolean equals(Object o) {
	    if (!(o instanceof Unque1)) {
	      return false;
	    }
	    Unque1 other = (Unque1) o;
	    return other.name.equals(name);
	  }
	  
	  @Override
	public int hashCode() {
		return name.hashCode();
	}

	  void show(){
		  System.out.println("I am Unqiue Show method");
	  }
	  
}

class Unque2{
	
}