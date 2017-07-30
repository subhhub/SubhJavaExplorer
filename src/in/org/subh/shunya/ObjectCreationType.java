package in.org.subh.shunya;

public class ObjectCreationType {

	static {
		System.out.println("Inside static");
	}

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		ObjectCreationType ot = new ObjectCreationType();
		Class.forName("ObjectCreationType").isInstance(ot);		//to check instance
		
		ObjectCreationType object= (ObjectCreationType) Class.forName("ObjectCreationType").newInstance();
		
		new ObjectCreationType().testMethod();
		
		NoClassDefFoundError d;
		
	}
	
	public void testMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		ObjectCreationType st = new ObjectCreationType();
		System.out.println("st "+st.hashCode());
		
//		StringPoolTest ob = (StringPoolTest) Class.forName("ObjectCreationType").newInstance();
		ObjectCreationType ob = (ObjectCreationType) Class.forName("ObjectCreationType", true, this.getClass().getClassLoader()).newInstance();
		ob.testMethod();
		
		System.out.println("ob "+ob);

		
	}
}

class MyClass{
	
}
