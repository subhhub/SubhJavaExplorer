package in.org.subh.shunya.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CUnit {

	@Test
	public void testAdd() {
//		System.out.println("@Test - test_method_1");
        
        int a = new Calculator().add(10, 20);
        assertEquals(30, a);
	}

}
