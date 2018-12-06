package org.subh.shunya;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 *
 *
 */

public class C8DateTimeAPI {

	static final Logger logger = Logger.getLogger(C8DateTimeAPI.class);

	public static void main(String[] args) {

		System.out.println("Data Time API Java 8");
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime dateTime2 = LocalDateTime.of(1986, Month.DECEMBER, 01, 1, 5, 10, 15);
		System.out.println(dateTime2);
		System.out.println("After 6 Months "+dateTime2.plusMonths(5));
		System.out.println("Before 6 Months "+dateTime2.minusMonths(5));
		
		//Find data difference(or find age)
		LocalDate dateTime3 = LocalDate.of(1986, Month.DECEMBER, 01);
		LocalDate dateNow3 = LocalDate.now();
		Period p = Period.between(dateNow3, dateTime3);
		System.out.println("Current Age "+p);
		
		LocalDate dateTime4 = LocalDate.of(1986+60, Month.DECEMBER, 01);
		LocalDate dateNow4 = LocalDate.now();
		Period p4 = Period.between(dateNow4, dateTime4);
		System.out.println("Days Left "+p4);
		
		Year y = Year.of(1986);
		System.out.println(y.isLeap());
		
		ZoneId zid = ZoneId.systemDefault();
		System.out.println(zid);
		
		ZoneId zid1 = ZoneId.of("Asia/Calcutta");
		ZonedDateTime zdid = ZonedDateTime.now(zid1);
		System.out.println(zdid);
		
	}
}



