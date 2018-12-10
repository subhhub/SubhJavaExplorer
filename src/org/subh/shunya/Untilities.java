package org.subh.shunya;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Untilities {

	public static void main(String[] args) {

		
		System.out.println("<=isStringInt(scpActDt)====>");
		
	}
	
	static boolean isStringInt(String s)
	{
	    try
	    {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}	

	
	static String getScpActDt(long date, int time) {
		String scpActDt = null;
		if(date != 0) {
			String tm = String.valueOf(time);
			if(tm.length() == 4) {
				tm = tm + "00";
			} else if(tm.length() == 3) {
				tm = "0" + tm + "00";
			} else if(tm.length() == 2) {
				tm = "00" + tm + "00";
			} else if(tm.length() == 1) {
				tm = "000" + tm + "00";
			} else {
				tm = "000000";
			}
			scpActDt = dateToOracleDateTime((date + tm), "yyyyMMddHHmmss");
		}
		
		return scpActDt;
	}
	
	static String dateToOracleDateTime(String date, String format)
	  {
		String oracleDate = null;
		
		if (isNotEmpty(date))
		{
		  try
		  {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			SimpleDateFormat sdfIso = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
			Date dt = sdf.parse(date);
			sdfIso.setLenient(false);
			
			oracleDate = sdfIso.format(dt).toUpperCase();
		  }
		  catch (Exception e)
		  {
			System.out.println("     * dateToOracleDateTime(): "+ e.getMessage() +" .Date - " + date);
		  }
		}
		
		return oracleDate;
	  }
	
	static boolean isNotEmpty(String str)
	  {
	    return str!=null && !str.trim().equals("") && str.length()>0 ? true :false;
	  }
}
