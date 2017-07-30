package in.org.subh.shunya;

public class ClassLoaderCustomise {

	public static void main(String[] args) throws ClassNotFoundException {

		StudentCust sc = new StudentCust();			//default class loader
		
		CustomiseClassLoader cs = new CustomiseClassLoader();		
		cs.loadClass("StudentCust");					//class has loaded manually
		
		StudentCust sc1 = new StudentCust();
		
	}
}

class StudentCust{
	
}

class CustomiseClassLoader extends ClassLoader{
	
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.loadClass(name);
	}
}