package in.org.subh.shunya;

public class DesignPatternSingelton {

	public static void main(String[] args) {
		System.out.println("Singelton Test");
		
		SingelObjectEarly so = SingelObjectEarly.getSingleObject();
//		SingelObject so = new SingelObject();
		System.out.println("so "+so.hashCode());
		SingelObjectEarly so1 = SingelObjectEarly.getSingleObject();
//		SingelObject so1 = new SingelObject();
		System.out.println("so1 "+so1.hashCode());
		so.show();
		
		/*SingelObjectLazy so = SingelObjectLazy.getSingleObject();
		System.out.println("so "+so.hashCode());
		SingelObjectLazy so1 = SingelObjectLazy.getSingleObject();
		System.out.println("so1 "+so1.hashCode());
		so.show();*/
	}
}

class SingelObjectEarly{

	private  SingelObjectEarly() {
	}
	
	private static SingelObjectEarly so = new SingelObjectEarly();
	
	public static SingelObjectEarly getSingleObject(){
		return so;
	}
	
	void show(){
		System.out.println("I am inside Early singelton");
	}
}

class SingelObjectLazy{

	private  SingelObjectLazy() {
	}
	
	private static SingelObjectLazy so = null;
	
	public static SingelObjectLazy getSingleObject(){
		if(so == null){
			synchronized(SingelObjectLazy.class){
				if(so == null)
					so = new SingelObjectLazy();
			}
		}
		return so;
	}
	
	void show(){
		System.out.println("I am inside Lazy singelton");
	}
}