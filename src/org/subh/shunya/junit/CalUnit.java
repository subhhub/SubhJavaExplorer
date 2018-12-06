package org.subh.shunya.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CalUnit {

	 static Calculator cl = null;
	 
	 @Before
	 public void setUpObject(){		//used to create all the bobject
		 
		 cl = new Calculator();
	 }
	
    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
        
        int a = cl.add(10, 20);
        assertEquals(30, a);
        
        assertNull("null value found", null);
        
//        System.out.println("add "+a);
    }
	
	/**
	 * @Test - test_gprsConversion all cases
	 */
	@Test
    public void testGPRSonversionAll() {
        final Map<String, String> gprsVal = new HashMap<String, String>();
        gprsVal.put("2-5", "5200");
        gprsVal.put("2-45", "5204");
        gprsVal.put("2-345", "5234");
        gprsVal.put("2-0", "0200");
        gprsVal.put("0-2", "2000");

        Map<String, String> gprsExpected = new HashMap<String, String>();
        
        for (String setKey : gprsVal.keySet()) 
			gprsExpected.put(setKey, Calculator.gprsConversion(setKey));
        
        //Test equal, ignore order
        assertThat(gprsVal, is(gprsExpected));
    }

    /**
     * @Test - test_gprsConversion case X-X
     */
    @Test
    public void testGPRSonversionX_X() {
        final String vl = Calculator.gprsConversion("2-5");
        assertEquals("5200", vl);
    }
    
    /**
     * @Test - test_gprsConversion case X-XX
     */
    @Test
    public void testGPRSonversionX_XX() {
    	final String vl = Calculator.gprsConversion("2-45");
    	assertEquals("5204", vl);
    }
    
    /**
     * @Test - test_gprsConversion case X-XXX
     */
    @Test
    public void testGPRSonversionX_XXX() {
    	final String vl = Calculator.gprsConversion("2-345");
    	assertEquals("5234", vl);
    }
    
    /**
     * @Test - test_gprsConversion case X-0
     */
    @Test
    public void testGPRSonversionX_0() {
    	final String vl = Calculator.gprsConversion("2-0");
    	assertEquals("0200", vl);
    }
    
    /**
     * @Test - test_gprsConversion case 0-X
     */
    @Test
    public void testGPRSonversion0_X() {
    	final String vl = Calculator.gprsConversion("0-2");
    	assertEquals("2000", vl);
    }
}
