package in.org.subh.shunya;


import static java.lang.System.out;
import java.util.*;
import static java.lang.Math.abs;

public class StaticImport {
	
	public static void main(String[] args) throws InterruptedException {
		
		out.println("subh");
		
		abs(23.5f);
//		min(10, 20);		//Error

		Math.sin(300);
	}
	
}

