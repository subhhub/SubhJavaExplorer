package in.org.subh.shunya;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 *
 *
 *Java 8 has internal loop
 * forEach loop internally uses Consumer interface in order to print the vlaue and it accept Consumer interace object.
 */

class ConsImpl implements Consumer<Integer>{	//This we can implement by using Lambda Expression

	static final Logger logger = Logger.getLogger(ConsImpl.class);
	
	@Override
	public void accept(Integer t) {
		logger.info(t);
	}
	
}

public class C8forEachAndConsumerInterface {

	static final Logger logger = Logger.getLogger(C8forEachAndConsumerInterface.class);
	
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(2,4,0,6,7,6,1,3,65,8);
		
//		values.forEach(i -> logger.info(i));		//forEach accept Consumer functional interface

		Consumer<Integer> con = new ConsImpl();
		values.forEach(con);		//Explicitly passing consumer interface
	}
}
