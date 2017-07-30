package ocjp6;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question169 {
	private String s;

	public Question169(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		Question169 ws1 = new Question169("aardvark");
		Question169 ws2 = new Question169("aardvark");
		String s1 = new String();
		String s2 = new String();
		hs.add(ws1);
		hs.add(ws2);
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs.size());
		
		
		Set set = new TreeSet();
		Set set1 = new HashSet();
		Set set2 = new LinkedHashSet();
		
		set.add(new Integer(2));
		set.add(new Integer(1));
		set.add(new Integer(1));
		set.add(new Integer(23));
		set.add(new Integer(15));
		set.add(new Integer(27));
		set.add(new Integer(13));
		System.out.println(set);
		
	}
}