package in.org.subh.shunya;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 *
 *call by Method
 *
 */
public class C8MethodReference {

	static final Logger logger = Logger.getLogger(C8MethodReference.class);

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(2, 4, 0, 6, 7, 6, 1, 3, 65, 8);


		values.forEach(logger::info); 
		values.forEach(System.out::println); 
	}
}
