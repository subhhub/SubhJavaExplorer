package in.org.subh.shunya;

public class InnerClassAnonymous {

	static int v  = 20;
	static Popcorn pc3 = new Popcorn(){		// Anonymous inner class that extends Popcorn class
		public void commonTaste(){
			System.out.println("Common taste again anonymous " +v);
		}
	};
	
	public static void main(String[] args) {
		System.out.println("###########Anonymous Inner Clases##########");
		
		Popcorn pc = new Popcorn(){		// Anonymous inner class that extends Popcorn class
			public void commonTaste(){
				System.out.println("Common taste again anonymous ");
			}
		};
		pc.commonTaste();
		pc.tasteSweet();
		
//		Popcorn pc1 = new Popcorn();
//		pc1.commonTaste();
		
		/*Popcorn pc2 = new SubPopcorn(){
			public void commonTaste(){
				System.out.println("Common taste again in child class");
			}
		};*/
//		pc2.commonTaste();
		//OR
		/*new SubPopcorn(){
			public void commonTaste(){
				System.out.println("Common taste again in child class redefined");
			}
		}.commonTaste();*/
		
		/*new SubPopcorn(){
			public void show(){
				System.out.println("added new method");
			}
		}.show();*/
		
		/*new SubPopcornCons("Subh"){
			public void show(){
				System.out.println("added new method");
			}
		}.show();*/
		
		
//		System.out.println("anonymous class name "+ pc3.getClass().getName());	//InnerClassAnonymous$1
//		System.out.println("anonymous class name "+ pc.getClass().getName());	//InnerClassAnonymous$2
//		System.out.println("anonymous class name "+ pc1.getClass().getName());	//InnerClassAnonymous
	}
}

class Popcorn{
	
	public void commonTaste(){
		System.out.println("Popcorn common taste");
	}
	public void tasteSweet(){
		System.out.println("Popcorn taste sweet ");
	}
}
class SubPopcorn extends Popcorn{
	
	/*SubPopcorn(String s) {
		// TODO Auto-generated constructor stub
	}*/
	
	public void commonTaste(){
		System.out.println("Common taste again in child");
	}
}
class SubPopcornCons extends Popcorn{
	public SubPopcornCons(String s) {
		System.out.println("Arg constroctor added "+s);
	}
	public void commonTaste(){
		System.out.println("Common taste again in child");
	}
}

