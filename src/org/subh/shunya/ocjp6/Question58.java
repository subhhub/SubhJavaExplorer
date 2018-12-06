package org.subh.shunya.ocjp6;

public class Question58<T> {

	private T object;
	public Question58(T obj) {
		// TODO Auto-generated constructor stub
		this.object = obj;
	}
	public T getObject(){
		return object;
	}
	
	public static void main(String[] args) {
		 Question58<String> q5 = new Question58<String>("answer");
		 Question58<Integer> q6 = new Question58<Integer>(48);
		 System.out.println(q5.getObject()+" "+q6.getObject());
	}
}
