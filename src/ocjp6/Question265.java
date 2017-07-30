package ocjp6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Question265 {

	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

	public static void main(String[] args) {
		
		String s = null;
		
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		Iterator it = reverse(list);
		for (Object obj : reverse(list).hasNext())
			System.out.print(obj + ", ");
	}

}
