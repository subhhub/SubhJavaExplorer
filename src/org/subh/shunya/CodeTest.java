package org.subh.shunya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

import org.subh.shunya.one.CodeTest1;

public class CodeTest {
	
	synchronized public static void main(String[] args) {

		
		System.out.println(0<0);
		
//		primeNum();
//		oddEven();;
//		factNum();;
//		fabnoSeries();;
//		binary2Decimal();;
//		palindromeNum();;
//		sortArray();;
//		findUniqueChar();;
//		revString();;
		
		String str = "subhash";
		
//		findMiddleChar(str);
//		reverseString(str);
//		reverseString(str);
//		findUniqueUsingCollection(str);
//		findDuplicateUsingCollection(str);
//		findDuplicateString(str);
//		arrayMinValue();
//		arraySortBubble();
//		SortingString(str);
//		SortingString2(str);
//		StringContainsDigits(str);
//		arrayDuplicateValue();
//		findCommonElementsThreeArrays();
//		mergeSortedArray();
		mergeSortedArrayUsingCollection();
//		reverseArray();
//		reverseNumber();
		
//		int vl = reverseNumber2(12345);
//		System.out.println("vl "+vl);
		
//		int vl = addTwoNumbersWithoutPlusOperator(5, 4);
//		System.out.println("Add Two Nubmers without using Plus operator "+vl);
		
//		System.out.println("Hello Code");
//		System.out.println(" arg "+ args[0]);
		
//		 int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
//		 System.out.println("Key 14's position: "+binarySearch(arr, 14));
		 
		 /*int num = 10;
		 m1(num);
		 System.out.println(num);*/
		
//		long rs = fib(199999);
//		System.out.println(" rs = "+rs);
		
//		String mrg = mergeStringFunc("ORANGE", "pineapple");
//		String mrg = mergeStringFunc("ab", "zsd");
//		System.out.println("merge "+mrg);
		
//		String strN = "null";
//		System.out.println("isNumeric "+isNumeric(str));
		
//		String strrec = "jobgotit";
//		new CodeTest().rec(strrec);
//		System.out.println(rStr);
}
	
	void regularExpressionTest(){
		
		String str = "214072222227871 0 222208C0F226F8B1F4AE26883BE76BDE 100 ";
//		String str = "214072222227871 0; 222208C0F226F8B1F4AE26883BE76BDE 100";
//		Pattern ptn = Pattern.compile("[ ]{1,}");	//check only single sapces
		Pattern ptn = Pattern.compile("^.*(^[ ]{1,}|[ ]{2,}|[\t]{1,}).*");	//check starting space, double sapces and single tab in whole string from starting to end
//		Pattern ptn = Pattern.compile("\\w[\\s]{2,}\\w");	//check only double sapces
//		Pattern ptn = Pattern.compile("\\w[ ]{2,}\\w");	//check only double spaces
//		Pattern ptn = Pattern.compile(";");
		boolean mtch = ptn.matcher(str).find();
		System.out.println("bool3 "+mtch);
		
	}
	
	static String rStr = "";
	String rec(String str){
		
		int len = str.length();
		
		rStr = rStr + str.substring(len-1, len);
		String nStr = str.substring(0, len-1);
		System.out.println(len+" rSr "+rStr);
		
		if(len>1)
			rec(str.substring(0, len-1));
		else
			return rStr;
		
		return str;
	}
	
	static int last_digit = 0;
	static int reversedNum = 0;
	public static int reverseNumber2(int input){
		
//		int input = 12345;

		System.out.println(0* 10);
		
		if(input != 0){
			 last_digit = input % 10;
//			    if (last_digit % 2 != 0) {     		//only even number
			        reversedNum = reversedNum * 10 + last_digit;

//			    }
			    input = input / 10; 
			reverseNumber2(input);
		}
		
		/*while (input != 0) {    
		    last_digit = input % 10;
//		    if (last_digit % 2 != 0) {     		//only even number
		        reversedNum = reversedNum * 10 + last_digit;

//		    }
		    input = input / 10; 
		}*/
		System.out.println(" reversedNum "+reversedNum);
		return reversedNum;
	}
	
	/*
     * Adding two integers without any arithmetic operator and using recursion.
     * This solution also uses XOR and AND bitwise and << left shift bitshift
     * operator
     */
    public static int addTwoNumbersWithoutPlusOperator (int a, int b){ 
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
    }

	public static void reverseNumber(){
		
		int input = 12345;
		int last_digit = 0;
		int reversedNum = 0;
		System.out.println(0* 10);
		
		while (input != 0) {    
		    last_digit = input % 10;
//		    if (last_digit % 2 != 0) {     		//only even number
		        reversedNum = reversedNum * 10 + last_digit;

//		    }
		    input = input / 10; 
		}
		System.out.println(" reversedNum "+reversedNum);
	}

	public static void simplStringSearch(){
		
		String myString = "I am a String!";
		
        if(myString.indexOf("String") == -1) {
            System.out.println("String not Found!");
        }
        else {
            System.out.println("String found at: " + myString.indexOf("String"));
        }
		
	}
	public static void removeDuplicateFromList(){
		ArrayList<Object> al = new ArrayList<Object>();
	    
	    al.add("java");
	    al.add('a');
	    al.add('b');
	    al.add('a');
	    al.add("java");
	    al.add(10.3);
	    al.add('c');
	    al.add(14);
	    al.add("java");
	    al.add(12);
	    
	    System.out.println("Before Remove Duplicate elements:"+al);
	 
	    for(int i=0;i<al.size();i++){
	    	for(int j=i+1;j<al.size();j++){
	    		if(al.get(i).equals(al.get(j))){
	    			al.remove(j);
	                j--;
	            }
	    	}
	    }
	 
	    System.out.println("After Removing duplicate elements:"+al);
	}
	
	public static long fib(int N) {
		long result = 0;
        int[] array = new int[N];
        
        if(N>1){
        	array[0] = 1;
        	array[1] = 2;
        }	
        for (int i = 2; i < N-1; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }

        for (int even: array) {
            if (even % 2 == 0) {
            	
            	System.out.println("even "+even);
            	if(even<N)
            		result += even;
            }
        }
        System.out.println(result);
        
		return result;
	}
		
	public static boolean isNumeric(String str){  
		try {  
			double d = Double.parseDouble(str);  
		}  
		catch(NumberFormatException nfe) {  
			return false;  
		}  
		return true;  
	}
	
	public static String mergeStringFunc(String a, String b) {
	    int length1 = a.length();
	    int length2 = b.length();
	    int commonLength = Math.min(length1, length2);
	
	    StringBuilder mixedStringBuilder = new StringBuilder(length1 + length2);
	    // Append the characters which both strings have, mixing them
	    for (int i = 0; i < commonLength; i++) {
	        mixedStringBuilder.append(a.charAt(i)).append(b.charAt(i));
	    }
	
	    // Append the remaining characters
	    mixedStringBuilder.append(a, commonLength, length1).append(b, commonLength, length2);
	
	    return mixedStringBuilder.toString();
	}
	
	static void sortingWords(){
		String[] arr = { "Banana", "Apple", "Orange", "Fruit", "Watermelon", "Hello World" };
		
		String tmp;
		for (int i = 0; i < arr.length; i++) {
			
			tmp = arr[i];
			for (int j = 0; j < arr.length; j++) {
				
				if (i == j)
					continue;
				
				int x = tmp.compareTo(arr[j]);
				if (x < 0) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
	static void m1(int num){
		num = 20;
	}
	
	private static void reverseArray() {
		int []input2 = {0,1,20,40,5,7,8,11};
		int ln1 = input2.length;
		int []input3 = new int[ln1];
		
		int i = input2.length-1;
		for (int l2 = 0; l2 < input2.length-l2; l2++, i--) {
			int tmp = input2[l2];
			input2[l2] = input2[i];
			input2[i] = tmp;
		}
		
		for (int k = 0; k < ln1; k++) {
			System.out.println(input2[k]);
		}
	}
	
	private static void mergeSortedArrayUsingCollection() {
		
		int vl[] = {3,5,2,7,8,1};
		int vl1[] = {30,50,20,70,80,10};
		
		List ls1 = new ArrayList(Arrays.asList(vl));
		List ls2 = new ArrayList(Arrays.asList(vl1));
		
		ls1.forEach(l -> System.out.println(l));
		
		System.out.println(ls1);

		Collections.sort(ls1);
		Collections.sort(ls2);

		System.out.println(ls2);
		
//		ls1.forEach(i->System.out.println(i));
		
//		Set st1 = new TreeSet(ls1);
//		Set st2 = new TreeSet(ls2);
//		
//		System.out.println(st1);
//		System.out.println(st2);
	}
	

	private static void mergeSortedArray() {
		int []input1 = {2,3,4,7,8};
		int []input2 = {0,1,20,40,5,7,8,11};
		int []input3 = new int[10];
		int ln1 = input1.length;
		int ln2 = input2.length;
		int ln3 = input3.length; 
		
		for (int l = 0; l < input1.length; l++) {
			for (int l2 = 0; l2 < input2.length; l2++) {
				if(input1[l]>input2[l2]){
					input3[l] = input2[l2];
//					System.out.println(input2[l2]);
				}
				else{
					input3[l] = input2[l];
//					System.out.println(input1[l]);
					break;
				}
			}
		}
		for (int k = 0; k < ln3; k++) {
			System.out.println(input3[k]);
		}
	}

	private static void findCommonElementsThreeArrays() {
		int []input1 = {5, 10, 1, 20, 40, 80};
		int []input2 = {6, 7, 20, 10, 100};
		int []input3 = {3, 10, 15, 20, 30, 70, 80, 120};
		int i = 0, j = 0, k = 0;
		 
		int ln1 = input1.length;
		int ln2 = input2.length;
		int ln3 = input3.length; 
		
		for (int l = 0; l < input1.length; l++) {
			for (int l2 = 0; l2 < input2.length; l2++) {
				if(input1[l]==input2[l2]){
					for (int m = 0; m < input3.length; m++) {
						if(input2[l2]==input3[m]){
							System.out.println("mathc found "+input3[m]);
						}
					}
				}
			}
		}
	}

	private static void arrayDuplicateValue() {
		int ary[]  = {4,6,2,7,5,9,3,6,3,8,40,7};
		int ln = ary.length;
		int dup[] = new int[ln];
		for (int i = 0; i < ln; i++) {
			for (int j = i+1; j < ln; j++) {
				if(ary[i]==ary[j]){
					System.out.println("duplicate "+ary[i]);
				}
			}
		}
	}

	private static void StringContainsDigits(String str) {
		int ln = str.length();
		char ch[] =  str.toCharArray();
		for (int i = 0; i < ln; i++) {
			if(ch[i]>65 && ch[i]<127 )
				System.out.println("Char Found "+ch[i]);
			else
				System.out.println("Degit Found "+ch[i]);
		}
	}

	private static void SortingString2(String str) {
		String original = "edcba";
		int j = 0;
		char temp = 0;

		char[] chars = original.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (j = 0; j < chars.length; j++) {
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		for (int k = 0; k < chars.length; k++) {
			System.out.println(chars[k]);
		}
	}
	
	private static void SortingString(String str) {
		int ln = str.length();
		int ary[] = new int[ln];
		for (int i = 0; i < ln; i++) {
//			System.out.println((int)str.charAt(i));
			ary[i] = (int)str.charAt(i);			//convert char to ascii
		}
		boolean bl = true;
		while(bl){
			bl = false;
			for (int i = 0; i < ln-1; i++) {
				if(ary[i]>ary[i+1]){
					int tmp = ary[i];
					ary[i]=ary[i+1];
					ary[i+1] = tmp;
					bl = true;
				}
			}
		}
		for (int i = 0; i < ln; i++) {
			System.out.print((char)ary[i]);
		}
	}

	private static void arraySortBubble() {
//		int ary[]  = {4,6,2,7,5,9,3,8};
		int ary[]  = {5,1,4,2,8};
		int ln = ary.length;
		int tmp;
		boolean rn = true;
//		System.out.println(ln + " "+ary[0]);
		while(rn){
			rn = false;
			for (int i = 0; i < ln-1; i++) {
				if(ary[i]>ary[i+1]){
					tmp = ary[i];
					ary[i]=ary[i+1];
					ary[i+1] = tmp;
					rn = true;
				}
			}
//			System.out.println("count ");
		}
		for (int i = 0; i < ln; i++) {
			System.out.print(ary[i]);
		}
	}

	private static void arrayMinMazValue() {
		int ary[]  = {4,6,2,7,5,9,3,6,3,8,4,7};
		int ln = ary.length;
		int min = ary[0];
		for (int i = 0; i < ln; i++) {
			if(min>ary[i])
				min = ary[i];
		}
		System.out.println("min "+min);
	}
	
	

	private static void findDuplicateString(String str) {
		int ln = str.length()-1;
		for (int i = 0; i <ln; i++) {
			for (int j = i+1; j <=ln; j++) {
				if(str.charAt(i) == str.charAt(j))
					System.out.println("duplicate "+str.charAt(i));
			}
		}
	}
	
	private static void findUniqueUsingCollection(String str){
		System.out.println(str);
		int ln = str.length()-1;
		Set set = new TreeSet();
		for (int i = 0; i <ln; i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
		
	}
	
	static void findDuplicateUsingCollection(String str){
		System.out.println(str);
		int ln = str.length();

		boolean bl = false;
		Set set = new HashSet();
		for (int i = 0; i <ln; i++) {
			bl = set.add(str.charAt(i));
			if(bl == false)
				System.out.println("duplicate "+str.charAt(i));

		}
		System.out.println(set);
		
	}
	
	static void findMiddleChar(String str){
		int len = str.length();
		char sr = str.charAt(len/2);
		System.out.println(sr);
	}
	
	static void reverseString(String str){
		
		System.out.println(str);
		int ln = str.length()-1;
		char st[] = new char[ln+1];
		int j = 0;
		for (int i = ln; i >=0; j++, i--) {
			System.out.println(str.charAt(i) +" "+j);
			st[j] = str.charAt(i);
//			j++;
		}
//		System.out.println(st[0]+" "+st[1] +" "+st[2]+" "+st[3]);
		String s = new String(st);
		System.out.println(s);
	}
	
	static public int binarySearch(int[] inputArr, int key) {
        
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

	static void findUniqueChar(){
		String s = "subshassh";

		int ln = s.length();
		boolean fl = false;
		char un[] = new char[20];
		un[0] = s.charAt(0);
		
		System.out.println(s.charAt(0));
		for(int i = 1; i<ln; i++){
			
			for(int j = 0; j<un.length; j++){
				if(un[j]==s.charAt(i)){
					fl = true;
				}
			}
			if(fl == false){
				un[i]=s.charAt(i);
			}
			fl = false;
		}
		
		String ns = new String(un);
		System.out.println("ns "+ns);
	}
	
	static void sortArray(){
		int numbers[] = new int[]{3,4,67,3,9,5,12,5,8,3,8,4};
		System.out.println("numbers "+numbers);
		int tempVar = 0;
		for (int i = 0; i < numbers.length; i++)
		{
		   for(int j = 0; j < numbers.length; j++)
		   {
				if(numbers[i] > numbers[j + 1])
				{
					tempVar = numbers [j + 1];
				    numbers [j + 1]= numbers [i];
				    numbers [i] = tempVar;
				}
		    }
		}
		System.out.println(numbers);

	}
	
	static void revString(){
		System.out.println("Reverse String  ");
		
		String rv =  "subhash";
		int size = rv.length();
		
		int sz[] = new int[size];
		int tmp;
		for(int i = 0; i <sz[size/2]; i++){
			tmp = sz[i];
			sz[i] = sz[size-i];
			sz[size - i] = tmp;
		}
		
		System.out.println("sz "+sz[2]);
		
		/*String rv =  "subhash";
		char s = rv.charAt(0);
		
		for(int i = rv.length()-1; i>=0;i--)
			System.out.println(rv.charAt(i));*/
		
//		System.out.println(" s "+s);
	}
	
	static public String reverseCharArray(String s) {
	    char[] reverseStringArray = new char[s.length()];
	    for (int i = s.length() - 1, j = 0; i != -1; i--, j++) {
	        reverseStringArray[j] = s.charAt(i);
	    }
	    return new String(reverseStringArray);
	}

	static void palindromeNum(){
		System.out.println("Palindrome Number "+31/10);
		
		int num = 2345432;
		int vl;
		while(num>0){
			vl = num%10;
			num = num/10;
			System.out.println("vl "+vl);
		}
		
	}

	static void binary2Decimal(){
		System.out.println("Binary2Decimal/Decimal2Binary Number ");
		
		
		int integer = 127;
		String binary = Integer.toBinaryString(integer);
		int original = Integer.parseInt("1111111", 2);
		System.out.println(" Binary "+binary);

	}

	static void fabnoSeries(){
		System.out.println("Fibonacci series ");
		
		int vo = 0;
		int vc = 1;
		int vr = 0;
		//0,1,1,2,3,5,8,13,21,34,55,89,144...
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(vo);
			
			vr = vo + vc;
			vo = vc;
			vc = vr;
		}
	}
	
	static void factNum(){
		System.out.println("Factorial Test ");
		
		int f = 1;
		//(5=5*4*3*2*1=120
		for (int i = 1; i <= 5; i++) {
			f = f*i;
		}
		System.out.println(f);
	}
	
	static void oddEven(){
		System.out.println("Code Test ");
		
		//(2,4,6,8....) (1,3,5,7,9...)
		for (int i = 1; i < 20; i++) {
			
			if(i%2==0)
				System.out.println("even "+i);
//			else
//				System.out.println("odd "+i);
			
		}
	}
	
	static void primeNum(){
		System.out.println("Code Test "+2%1);
		//1 2 3 5 7 11...
		for (int i = 1; i < 20; i++) {
			
			for (int j = 1; j <= i; j++){

				int v = i%j;
				if(v==0 && i==j){
					System.out.println(i);
					break;
				}
				else if(v==0 && i!=j){
					if(j!=1)
						break;
				}
			}
		}
	}
}
