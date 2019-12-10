package in.org.subh.learn.java;

public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Object Shallow Clone");

		ShallowShare c = new ShallowShare(10);
		
		ShallowObject f3 = new ShallowObject(c, 20);
		System.out.println("Origianl :  "+ f3.i + " "+ f3.k.k);
		
		ShallowObject f2 = (ShallowObject) f3.clone();
		f2.i = 100;
		f2.k.k = 200;
		System.out.println("Cloned :  "+ f2.i + " "+ f2.k.k);
		
		System.out.println("Origianl :  "+ f3.i + " "+ f3.k.k);
	}
}

class ShallowObject implements Cloneable{
	
	int i = 0;
	ShallowShare k;			//This object will be shared between original and cloned object (class contain object)
	
	public ShallowObject(ShallowShare k, int i) {
		this.k = k;
		this.i = i;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * 
	 * Recommended if class has only primitive variables
	 */
	/*protected Object clone() throws CloneNotSupportedException {		//Shallow cloning recommended for Primitive value
		return super.clone();
	}*/
	

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * 
	 * Recommended if class has primitive and non primitive variables
	 */
	protected Object clone() throws CloneNotSupportedException {		//Deep cloning	recommended for non-primitiv value
		ShallowShare c = new ShallowShare(k.k);
		ShallowObject d = new ShallowObject(c, i);
		
		return d;
	}
}

class ShallowShare{
	int k = 0;
	
	ShallowShare(int k) {
		this.k = k;
	}
}
