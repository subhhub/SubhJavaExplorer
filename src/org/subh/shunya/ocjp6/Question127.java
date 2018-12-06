package org.subh.shunya.ocjp6;
class Building {
}

public class Question127 extends Building {
	public static void main(String[] args) {
		Building build1 = new Building();
		Question127 barn1 = new Question127();
//		Question127 barn2 = (Question127) build1;
		Object obj1 = (Object) build1;
//		String str1 = (String) build1;
		Building build2 = (Building) barn1;
		
		System.out.println(build1);
		System.out.println(barn1);
//		System.out.println(barn2);
		System.out.println(obj1);
		System.out.println(build2);
		
	}
}