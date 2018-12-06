package org.subh.shunya;

import in.org.subh.shunya.one.CodeTest1;

public class OverloadTest {

	public static void main(String[] args) {
		System.out.println("OverrideTest ");

//		new OverloadTest().over1(10, 20);

//		new OverloadTest().over1(null, null);		//The method over1(Integer, Integer) is ambiguous for the type OverloadTest
		
	}


	//Combination 1 	//In this combination first primitive will call later Non primitive
	/*void over1(int a, int b){
		System.out.println("test 1");
	}
	void over1(Integer a, Integer b){
		System.out.println("test 2");
	}*/
	
	//Combination 2		//In this combination ambiguity problem will occur at CE if passing null
	/*void over1(Integer a, Integer b){
		System.out.println("test 3");
	}
	void over1(String a, String b){
		System.out.println("test 4");
	}*/
	
	//Combination 3		//In this combination if passing null then String will be called
	/*void over1(String a, String b){
		System.out.println("test 5");
	}
	void over1(Object a, Object b){
		System.out.println("test 6");
	}*/
}
