package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

/**
 * @author esubkew
 *
 *
 */

public class C8StreamAnyMatchPredicte {

	static final Logger logger = Logger.getLogger(C8StreamAnyMatchPredicte.class);

	public static void main(String[] args) {

		Predicate<StudentAny> p1 = s -> s.stuName.startsWith("S");
		Predicate<StudentAny> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("Z");       
		List<StudentAny> list = StudentAny.getStudents();

		/* anyMatch() method checks whether any Stream element matches
		 * the specified predicate
		 */
		boolean b3 = list.stream().anyMatch(p1);
		System.out.println(b3);
		boolean b4 = list.stream().anyMatch(p2);
		System.out.println(b4);
	}
}

class StudentAny{
	   int stuId;
	   int stuAge; 
	   String stuName; 
	   StudentAny(int id, int age, String name){ 
	      this.stuId = id;  
	      this.stuAge = age; 
	      this.stuName = name; 
	   } 
	   public int getStuId() { 
	      return stuId; 
	   } 
	   public int getStuAge() { 
	      return stuAge; 
	   }
	   public String getStuName() { 
	      return stuName; 
	   } 
	   public static List<StudentAny> getStudents(){        
	       List<StudentAny> list = new ArrayList<>();        
	       list.add(new StudentAny(11, 28, "Lucy"));        
	       list.add(new StudentAny(28, 27, "Kiku"));        
	       list.add(new StudentAny(32, 30, "Dani"));        
	       list.add(new StudentAny(49, 27, "Steve"));       
	       return list;    
	   }
	}