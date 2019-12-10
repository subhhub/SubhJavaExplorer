package in.org.subh.learn.java;

public class InnerClassPrivate {

	public static void main(String[] args) {
		System.out.println("Inner Class Private ");
		
		new InnerClassPrivate().privateClass();
	}
	
	class InnePrivateClass{
		public void innerLight(){
			System.out.println("Inner Private Class");
		}
	}
	
	void privateClass() {
		InnePrivateClass innePrivateClass = new InnePrivateClass();
		innePrivateClass.innerLight();
	}
}
