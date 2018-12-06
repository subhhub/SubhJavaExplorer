package org.subh.shunya;

public class ImmutableClass {

	public static void main(String[] args) {

		System.out.println("Immutable Class");
		
		User us = new User("subh", "pass");
	}
}

final class User{
	private final String uname;
	private final String psss;
	
	public User(String uname, String psss) {
		super();
		this.uname = uname;
		this.psss = psss;
	}
	
	public String getUname() {
		return uname;
	}

	public String getPsss() {
		return psss;
	}
}