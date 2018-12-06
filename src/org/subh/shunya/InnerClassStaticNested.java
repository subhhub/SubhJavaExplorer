package org.subh.shunya;

public class InnerClassStaticNested {

	OuterStatic os = new OuterStatic();
	OuterStatic.OuterInner oo = new OuterStatic.OuterInner();
	
	public static void main(String[] args) {
		System.out.println("Nested Inner Classes ");
		
		OuterStatic os = new OuterStatic();
		OuterStatic.OuterInner oo = new OuterStatic.OuterInner();
		oo.m1();
		
//		OuterInner oi = new OuterInner();
//		oi.m1();
	}
	
	static class OuterInner{
		
		public static void main(String[] args) {
			System.out.println("Static Nested Classes Main method");
		}
		
		void m1(){
			System.out.println("InnerClassStaticNested OuterInner m1 ");
		}
	}
}

class OuterStatic{
	int x = 10;
	static int y = 20;
	static class OuterInner{
		
		void m1(){
			System.out.println("OuterStatic OuterInner m1 ");
//			System.out.println(x);								//Can't access non static variable
			System.out.println(y);
		}
	}
	
	interface Inter{
		public final int fl = 10;
		
		class InnerInter{
			
			void interInner(){
				System.out.println("Inter InnerInter interInner ");
			}
		}
		void interInner();
	}
	
	class InnerInterImpl implements Inter{

		@Override
		public void interInner() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
