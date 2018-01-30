package in.org.subh.shunya.one;

import java.io.IOException;
import java.util.Collection;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeTest1 {
	
	void reltioCode() {
		String str = "Fortune Cookie1 " + "% " + "Fortune Cookie 2 " + "% " 	+ "Fortune Cookie N";
		
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreElements()) {
			String s = st.nextToken("%");
			System.out.println(s);
			
			StringBuffer sb;
			StringBuilder sbb;
		}
		
		Collection c;
		
		
		int vl[] = {3,5,2,7,8,1};
		
		vl[1] = vl[1] + vl[2];
		vl[2] = vl[1] - vl[2];
		vl[1] = vl[1] - vl[2];
		
		for(int i = 0; i<vl.length; i++)
			System.out.print(vl[i]+" ");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		String str = "214072222227871 0 222208C0F226F8B1F4AE26883BE76BDE 100 ";
//		String str = "214072222227871 0; 222208C0F226F8B1F4AE26883BE76BDE 100";
//		Pattern ptn = Pattern.compile("[ ]{1,}");
		Pattern ptn = Pattern.compile("\\w[\\s]{2,}\\w");	//\w[ ]{2,}\w
//		Pattern ptn = Pattern.compile("\\w[ ]{2,}\\w");	//\w[ ]{2,}\w
//		Pattern ptn = Pattern.compile(";");
		boolean mtch = ptn.matcher(str).find();
		System.out.println("bool3 "+mtch);
		 
	}  
	
/*	public String replaceWithPattern(String str,String replace){
        
        Pattern ptn = Pattern.compile("\\s+");
        boolean mtch = ptn.matcher(str).find();
        
        System.out.println(" mtch "+mtch);
        
        return mtch.replaceAll(replace);
    }*/
}

