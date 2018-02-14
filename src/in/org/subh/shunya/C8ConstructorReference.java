package in.org.subh.shunya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 *
 *call by Method
 *
 */

interface ConstSample {

	ConstInterfac get();
}
class ConstInterfac{
	
	ConstInterfac(){	
		System.out.println("Const Interf");
	}
}

public class C8ConstructorReference {

	static final Logger logger = Logger.getLogger(C8ConstructorReference.class);

	public static void main(String[] args) {

		//Lembda Approach
		ConstSample cs = () ->{
			ConstInterfac ci = new ConstInterfac();
			return ci;
		};
//		cs.get();
		
		
		//Constructor Reference
		ConstSample cs1 = ConstInterfac::new;
		cs1.get();
	}
}

