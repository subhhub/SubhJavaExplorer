package in.org.subh.shunya.ocjp6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class Question1 {

	public static void main(String[] args) {

		// List<int> ll = new ArrayList<int>();

//		List ls = new ArrayList();
//		sum(ls);
		
	}

	public static int sum(List<Integer> list) {
		int sum = 0;
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			int i = ((Integer) iter.next()).intValue();
			sum += i;
		}
		return sum;
	}


}
