package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static in.org.subh.learn.java.EmployeePredicateFilter.*;

/**
 * @author kewats
 * 
 *         Employee Predict Example
 *
 */
public class C8PredicteEmployee {

	public static void main(String[] args) {
		EmployeePredicte e1 = new EmployeePredicte(1, 23, "M", "Rick", "Beethovan");
		EmployeePredicte e2 = new EmployeePredicte(2, 13, "F", "Martina", "Hengis");
		EmployeePredicte e3 = new EmployeePredicte(3, 43, "M", "Ricky", "Martin");
		EmployeePredicte e4 = new EmployeePredicte(4, 26, "M", "Jon", "Lowman");
		EmployeePredicte e5 = new EmployeePredicte(5, 19, "F", "Cristine", "Maria");
		EmployeePredicte e6 = new EmployeePredicte(6, 15, "M", "David", "Feezor");
		EmployeePredicte e7 = new EmployeePredicte(7, 68, "F", "Melissa", "Roy");
		EmployeePredicte e8 = new EmployeePredicte(8, 79, "M", "Alex", "Gussin");
		EmployeePredicte e9 = new EmployeePredicte(9, 15, "F", "Neetu", "Singh");
		EmployeePredicte e10 = new EmployeePredicte(10, 45, "M", "Naveen", "Jain");

		List<EmployeePredicte> employees = new ArrayList<>();
		employees.addAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));

		System.out.println(filterEmployees(employees, isAdultMale()));

		System.out.println(filterEmployees(employees, isAdultFemale()));

		System.out.println(filterEmployees(employees, isAgeMoreThan(35)));

		// Employees other than above collection of "isAgeMoreThan(35)"
		// can be get using negate()
		System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
	}
}

class EmployeePredicateFilter {
	public static Predicate<EmployeePredicte> isAdultMale() {
		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}

	public static Predicate<EmployeePredicte> isAdultFemale() {
		return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	}

	public static Predicate<EmployeePredicte> isAgeMoreThan(Integer age) {
		return p -> p.getAge() > age;
	}

	public static List<EmployeePredicte> filterEmployees(List<EmployeePredicte> employees,
			Predicate<EmployeePredicte> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<EmployeePredicte>toList());
	}
}

class EmployeePredicte {

	public EmployeePredicte(Integer id, Integer age, String gender, String fName, String lName) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.firstName = fName;
		this.lastName = lName;
	}

	private Integer id;
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;

	// Please generate Getter and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// To change body of generated methods, choose Tools | Templates.
	@Override
	public String toString() {
		return this.id.toString() + " - " + this.age.toString();
	}
}