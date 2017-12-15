package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.List;

public class CodeStack {

	public static void main(String[] args) {

		Stack1 st = new Stack1();
		
		st.push("subh1");
		st.push("subh2");
		st.push("subh3");
		st.push("sub4");

		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st);
		
	}
}

class Stack1{
	List ls = new ArrayList();
	
	void push(String el){
		ls.add(el);
	}
	
	String pop(){
		int sz = ls.size();
		String vl =  ls.get(sz-1).toString();
		ls.remove(sz-1);
		
		return vl;
	}
	
	@Override
	public String toString() {
		return ls.toString();
	}
}
