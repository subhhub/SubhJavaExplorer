package org.subh.shunya;

public class GarbageCollectorIslandofIsolation {

	public static void main(String[] args) {
		System.out.println("Garbage Collection IslandofIsolation Main");
		
		IOSTest it1 = new IOSTest();
		IOSTest it2 = new IOSTest();
		IOSTest it3 = new IOSTest();
		
		it1.i = it2;
		it2.i = it3;
		it3.i = it1;
		
		it1 = null;
		it2 = null;
		it3 = null;
		
		Object o;
	}
}
class IOSTest{
	IOSTest i;
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}