package in.org.subh.learn.java.one;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author kewats
 *
 */
public class CodeTest1 {
	
	public static final String CACHE_KEY_SEPARATOR = "_";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {

		Map mp = new HashMap<>();


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
