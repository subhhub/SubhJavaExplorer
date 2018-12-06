package org.subh.shunya.one;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CodeTest1 {
	
	public static final String CACHE_KEY_SEPARATOR = "_";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {

		String st = "subhash";
		
		int vl[] = {3,5,2,7,8,1};
		int vl1[] = {30,50,29,78,86,14};
		
		Arrays.sort(vl);
//		System.out.println(vl.toString());
		
		List<String> valdErr = new ArrayList<String>();
		valdErr.add("R84");
		valdErr.add("R82");
		valdErr.add("R85");
//		valdErr.forEach(str -> System.out.println(str));
		

		int LastIndexHavingRecords = 260;
		int seqNumber = 1;
		
		int rowNumVl=0;
		
		if(seqNumber==0)
			rowNumVl=1;
		else
			rowNumVl=0;
				
		for(int rowNum=rowNumVl; rowNum < LastIndexHavingRecords; rowNum++) {
			System.out.println((seqNumber * 260) + rowNum);
		}


	}
	
	 public static String getLookupKey(String... lookupKeys)
	  {
	    StringBuilder innerKey = new StringBuilder();

	    for (int i = 0; i < lookupKeys.length; i++)
	    {
	      innerKey.append(lookupKeys[i]);
	      if (i < lookupKeys.length - 1)
	      {
	        innerKey.append(CACHE_KEY_SEPARATOR);
	      }
	    }

	    return innerKey.toString();
	  }
}

class respDTO{
	
	String partialID;

	public String getPartialID() {
		return partialID;
	}

	public void setPartialID(String partialID) {
		this.partialID = partialID;
	}
}

