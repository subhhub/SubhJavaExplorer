package in.org.subh.shunya.one;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

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
		
		
		/*int ary[] = {1,2,3,2,4,5,6,3,3,2,7,8,4,9};
		Integer ary1 = new Integer(ary1);
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(ary1));
		Stream<Integer> filtered = ls.stream();*/
		
		/*Map<Integer, Integer> ls2 = new HashMap<>();
		int cnt = 0;
		int ary[] = {1,2,3,2,4,5,6,3,3,2,7,8,4,9};
		for(int i = 0; i<ary.length; i++){
			cnt = 0;
			for(int j = 0; j<ary.length; j++){
				
				if(ary[i]==ary[j]){
					cnt++;
					
					if(cnt == 2){
						ls2.put(ary[i], cnt); 
					}
					else if(cnt == 3){
						ls2.put(ary[i], cnt);
					}
				}
				
			}
		}
		
		for(Map.Entry<Integer, Integer> k : ls2.entrySet()){
			System.out.println(" K "+k.getKey() + " "+k.getValue());
		}*/
		
		
		Map<Integer, Integer> ls2 = new HashMap<>();
//		Map<Integer, Integer> ls2 = new ConcurrentHashMap<>();
		
		
		int cnt = 1;
		int ary[] = {1,2,3,2,4,5,6,3,3,2,7,8,4,9};
		
		for(int i = 0; i<ary.length; i++){
			
			if(ls2.containsKey(ary[i])){
				int vl = ls2.get(ary[i]);
				vl++;
				ls2.put(ary[i], vl);
			}	
			else{
				ls2.put(ary[i], cnt);
			}
		}
		
//		Map<Integer, Integer> ls3 = Collections.synchronizedMap(ls2);
		
		/*for(Map.Entry<Integer, Integer> k : ls2.entrySet()){
			if(k.getValue() != 2 && k.getValue() != 3)
				ls2.remove(k.getKey());
		}*/
		
		/*for(Map.Entry<Integer, Integer> k : ls2.entrySet()){
			if(k.getValue() == 2 || k.getValue() == 3)
				System.out.println(" K "+k.getKey() + " "+k.getValue());
		}*/
		
		/*for(Map.Entry<Integer, Integer> k : ls2.entrySet()){
			System.out.println(" K "+k.getKey() + " "+k.getValue());
		}*/

		
	}  
}

