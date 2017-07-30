package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CodeCopyListSet {

	public static void main(String[] args) {
		
		List ls = new ArrayList();
		ls.add("subh");
		ls.add("rubh");
		ls.add(10);
		ls.add("tubh");
		ls.add("tubh");
		ls.add("yubh");
		System.out.println("ls "+ls);
		
		Set st = new HashSet(10);
		st.add("subh");
		st.add("rubh");
		st.add("tubh");
		st.add("yubh");
		System.out.println("st "+st);
		
		Set stt = new HashSet(ls);
//		Set stt = new TreeSet(ls);
		System.out.println("stt "+stt);
		
		List lss = new ArrayList(st);
		System.out.println("lss "+lss);

	}

}
