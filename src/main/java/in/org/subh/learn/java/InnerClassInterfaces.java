package in.org.subh.learn.java;

import in.org.subh.learn.java.Vehicle.DefaultVahicle;

public class InnerClassInterfaces {

	public static void main(String[] args) {
		System.out.println("InnerClassInterfaces Main method");
		
//		OuterInter oi = new OuterInterImpl();
//		oi.m1();
		
//		OuterInter.InnerInterface oii = new OuterInter2Impl();
//		oii.m2();
		
		Vehicle.DefaultVahicle vd = new Vehicle.DefaultVahicle();		//Default value
		int nov = vd.defualtNoOfFiels();
		System.out.println("nov "+nov);
		
		DefaultVahicle vd1 = new DefaultVahicle();		//Default value
		int nov1 = vd1.defualtNoOfFiels();
		System.out.println("nov1 "+nov1);
		
		Vehicle vl = new DontWantDefualtImpl();		//Customize value
		nov = vl.defualtNoOfFiels();	
		System.out.println("nov "+nov);		
		
		VehicalType vlt = new VehicalType();
		VehicalType.Bus vb = vlt.new Bus();
		vb.getNumOfWheels();
	}
}

interface OuterInter{
	
	public void m1();
	interface InnerInterface{
		void m2();
	}
}
class OuterInterImpl implements OuterInter{

	public void m1() {
		System.out.println("Outer class method implementation");
	}
}
class OuterInter2Impl implements OuterInter.InnerInterface{

	public void m2() {
		System.out.println("Inner class method implementation");
	}
}

class VehicalType{
	
	interface Vehicle{
		int getNumOfWheels();
	}
	class Bus implements Vehicle{

		@Override
		public int getNumOfWheels() {
			System.out.println("Bus has 6 Wheels");
			return 6;
		}
	}
	class Auto implements Vehicle{

		@Override
		public int getNumOfWheels() {
			System.out.println("Auto has 4 wheels");
			return 4;
		}
		
	}
}

interface EmailService{

	public void sendEmail(EmailDetails e);
	
	class EmailDetails{
		String toList;
		String ccList;
		String subjLine;
		String mailBody;
		
	}
}

interface Vehicle{
	int getNumOfWheels();
	int defualtNoOfFiels();			//Deault implementation of a method by inner class
	
	public static final int vl = 10;
	
	class DefaultVahicle implements Vehicle{

		@Override
		public int getNumOfWheels() {
			return 0;
		}

		@Override
		public int defualtNoOfFiels() {
			return 2;
		}
		
	}
}
class DontWantDefualtImpl implements Vehicle{

	@Override
	public int getNumOfWheels() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defualtNoOfFiels() {
		// TODO Auto-generated method stub
		return 4;
	}

}