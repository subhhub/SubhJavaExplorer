package org.subh.shunya;

public class CopyConstructor {

	public static void main(String[] args) {
		System.out.println("Copy Constructor ");
		
		StudentCopy sc = new StudentCopy("subh", 30);
		System.out.println(sc.toString());
		StudentCopy copysc = new StudentCopy(sc);
		System.out.println(copysc.toString());
		
	}
}
class StudentCopy {

	String name;
	int age;
	public StudentCopy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public StudentCopy(StudentCopy sc) {
		this.name = sc.name;
		this.age = sc.age;
	}
}
