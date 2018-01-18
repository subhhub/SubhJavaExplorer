package in.org.subh.shunya;

import java.lang.reflect.InvocationTargetException;

public class ObjectCreationType {

	static {
		System.out.println("Inside static");
	}

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		ObjectCreationType ot = new ObjectCreationType();
		Class.forName("in.org.subh.shunya.ObjectCreationType").isInstance(ot);		//to check instance
		ObjectCreationType object= (ObjectCreationType) Class.forName("in.org.subh.shunya.ObjectCreationType").newInstance();
		
		new ObjectCreationType().newInstanceDefaultConstructor();
		new ObjectCreationType().newInstanceArgConstructor();
	
//		NoClassDefFoundError d;
		
	}
	
	public void newInstanceDefaultConstructor() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		ObjectCreationType st = new ObjectCreationType();
		System.out.println("st "+st.hashCode());
		
		ObjectCreationType ob = (ObjectCreationType) Class.forName("in.org.subh.shunya.ObjectCreationType").newInstance();
//		ObjectCreationType ob = (ObjectCreationType) Class.forName("ObjectCreationType", true, this.getClass().getClassLoader()).newInstance();
		
		//OR
		ObjectCreationType ob2 = ObjectCreationType.class.newInstance();
		
		System.out.println("ob "+ob.hashCode());
		System.out.println("ob "+ob);
		System.out.println("ob2 "+ob2);
	}

	public void newInstanceArgConstructor() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		
		MyClass ob = (MyClass) Class.forName("in.org.subh.shunya.MyClass").getConstructor(new Class[]{String.class}).newInstance("poo");
		ob.showM();
		
		//OR
//		Constructor<ObjectCreationType> constructor = ObjectCreationType.class.getConstructor(new Class[]{String.class});
//		ObjectCreationType emp3 = constructor.newInstance("subh");
		
		System.out.println("ob "+ob);
//		System.out.println("emp3 "+emp3);
	}
}

class MyClass{
	
	public MyClass(String subh) {
		System.out.println("subh "+subh);
	}
	
	void showM(){
		System.out.println("Constructor class");
	}
}
