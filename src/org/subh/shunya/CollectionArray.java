package org.subh.shunya;

import java.util.Arrays;

public class CollectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2,3,4,5};
		 
		int[] copied = new int[10];
		System.arraycopy(arr, 0, copied, 2, 5);//5 is the length to copy and it will copy from location 2
		 
		System.out.println(Arrays.toString(copied));
	}

}
