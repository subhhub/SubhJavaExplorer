package in.org.subh.shunya.junit;

import java.util.regex.Pattern;

public class Calculator {
	
	private final static String  RGX = "([0-9]){1}([-])([0-9]{3})|([0-9]){1}([-])([0-9]{2})|([0-9]){1}([-])([0-9]{1})";
	private final static String ONE_ZERO = "0";
	private final static String TWO_ZERO = "00";

	public static void main(String[] args) {

		int r = Calculator.add(10,20);
		System.out.println("addtion "+r);
		
		String vl = Calculator.gprsConversion("4-24");
		System.out.println("GPRS Converstion "+vl);
	}
	
	public static int add(int a, int b){
		return a+b;
	}

	public static String gprsConversion(String value) {
		
		if(value!=null && Pattern.matches(RGX, value)){			//Regular expression for X-X, X-XX, X-XXX

			final String splitValue[] = value.split("-");
			final String firstPart = splitValue[0];
			final String secondPart = splitValue[1];
			
			final int len = secondPart.length();
			
			StringBuilder sb = new StringBuilder();
			if(len==1)
				sb = sb.append(TWO_ZERO).append(secondPart).append(firstPart);
			else if(len==2)
				sb = sb.append(ONE_ZERO).append(secondPart).append(firstPart);
			else
				sb = sb.append(secondPart).append(firstPart);

			return sb.substring(2).concat(sb.substring(0,2));
		}
		else
			return value;
	}
}
