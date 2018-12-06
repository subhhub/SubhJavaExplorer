package org.subh.shunya;

//Java program to demonstrate working of Collections.sort()
//to descending order.
import java.util.*;

public class CollectionSorting {
	
	public static void main(String[] args) {
		
//		forwardSorting();
//		reveserSorting();
		forwardSortingHeterogeneous();
//		arraySorting();
		
	}
	
	static void forwardSortingHeterogeneous(){
		// Create a list of strings
        ArrayList al = new ArrayList();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add(10);				//RE: ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        al.add("Is");
        al.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
 
        // Let us print the sorted list
        System.out.println("List after the use of" + " Collection.sort() :\n" + al);
	}
	
	static void forwardSorting(){
		// Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
 
        // Let us print the sorted list
        System.out.println("List after the use of" + " Collection.sort() :\n" + al);
	}
	
	static void reveserSorting(){
		// Create a list of strings
		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeks For Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");

		/*
		 * Collections.sort method is sorting the elements of ArrayList in
		 * ascending order.
		 */
//		Collections.sort(al, Collections.reverseOrder());
		
		// Here we are using reverse() method
        // to reverse the element order of mylist
        Collections.reverse(al);

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() :\n" + al);
	}
	
	static void arraySorting(){

		// Our arr contains 8 elements
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr);
        System.out.println("Modified arr[] : %s"+ Arrays.toString(arr));
        
        
        // Our arr contains 8 elements
        int[] arr2 = {13, 7, 6, 45, 21, 9, 2, 100};
        // Sort subarray from index 1 to 5, i.e.,
        // only sort subarray {7, 6, 45, 21, 9} and
        // keep other elements as it is.
        Arrays.sort(arr2, 1, 5);
        System.out.println("Modified between arr[] : %s"+ Arrays.toString(arr2));
        
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr3 = {13, 7, 6, 45, 21, 9, 2, 100};
        // Sorts arr[] in descending order
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println("Collections.reverseOrder() arr[] : "+ Arrays.toString(arr3));
        
        
        String arr4[] = {"practice.geeksforgeeks.org",
			                "quiz.geeksforgeeks.org",
			                "code.geeksforgeeks.org"
			            };
		// Sorts arr[] in ascending order
		Arrays.sort(arr4);
		System.out.println("Modified String arr[] : "+ Arrays.toString(arr4));
		
		// Sorts arr[] in descending order
		Arrays.sort(arr4, Collections.reverseOrder());
		System.out.println("Modified String Reverse arr[] :"+ Arrays.toString(arr4));
				
	}
}