package in.org.subh.learn.java;

public class InnerClassNormal {

	InnerNoarmalPrint in = new InnerNoarmalPrint();
	
	public static void main(String[] args) {
		System.out.println("Inner Class Normal Outer ");
		
		/*InnerClassNormal icn = new InnerClassNormal();
		InnerClassNormal.InnerNoarmalPrint incl = icn.new InnerNoarmalPrint();
		InnerClassNormal.InnerNoarmalPrint incl2 = new InnerClassNormal().new InnerNoarmalPrint();
		incl.innerLight();
		new InnerClassNormal().new InnerNoarmalPrint().innerLight();
		new InnerClassNormal().in.innerLight();*/
		
		/*InnerClassNormal icn = new InnerClassNormal();
		InnerClassNormal.InnerNoarmalVarAccess incl = icn.new InnerNoarmalVarAccess();
		incl.innerLight();*/
		
		/*InnerClassNormal icn = new InnerClassNormal();
		InnerClassNormal.InnerNoarmalVarLocalAccess incl = icn.new InnerNoarmalVarLocalAccess();
		incl.innerLight();*/
		
		/*InnerClassNormal icn = new InnerClassNormal();
		InnerClassNormal.InnerNoarmalNesting icni = icn.new InnerNoarmalNesting();
		InnerClassNormal.InnerNoarmalNesting.InnerNoarmalNestingIn icnii = icni.new InnerNoarmalNestingIn();
		icnii.innerLight();*/
//		new InnerClassNormal().new InnerNoarmalNesting().new InnerNoarmalNestingIn().innerLight();
		
//		new InnerClassNormal().new InnerNoarmalVarAccess().innerLight();
//		new InnerClassNormal().new InnerNoarmalNesting().new InnerNoarmalNestingIn().innerLight();
	}
	
	int x = 10;
	static int y = 30;
	class InnerNoarmalVarAccess{
		public void innerLight(){
			System.out.println("InnerNoarmal Light method");
			System.out.println("x "+x);
			System.out.println("y "+y);		// static member cab be accessed
		}
	}
	
	class InnerNoarmalVarLocalAccess{		//Access local class variable
		int x = 40;
		public void innerLight(){
			int x = 50;
			System.out.println("InnerNoarmal Light method");
			System.out.println("x "+new InnerClassNormal().x +" or "+InnerClassNormal.this.x);
			System.out.println("x "+this.x +" or "+InnerNoarmalVarLocalAccess.this.x);
			System.out.println("x "+x);
			System.out.println("y "+y);
		}
	}
	
	class InnerNoarmalNesting{			//Nesting of Inner classes
		
		class InnerNoarmalNestingIn{
			
			public void innerLight(){
				System.out.println("InnerNoarmalNestingIn Light method");
			}
		}
	}
	
	class InnerNoarmalPrint{
		public void innerLight(){
			System.out.println("InnerNoarmalPrint Light method");
		}
	}
}

class A1{
	private void m1(){
	}
	
	class B1{
		/*static void m2(){	//The method m2 cannot be declared static; static methods can only be declared in a static or top level type
		}*/
	}
}