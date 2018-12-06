package org.subh.shunya;

import java.util.ArrayList;
import java.util.List;

/**
 * @author esubkew
 *
 * Java program to illustrate the concept of Aggregation.
 * 
 * In this example, there is an Institute which has no. of departments like CSE, EE. 
 * Every department has no. of students. So, we make a Institute class which has a reference to Object or no. of Objects 
 * (i.e. List of Objects) of the Department class. 
 * That means Institute class is associated with Department class through its Object(s). 
 * And Department class has also a reference to Object or Objects (i.e. List of Objects) of Student class means 
 * it is associated with Student class through its Object(s).
 *
 */
public class DependencyAggregation {

	public static void main(String[] args) {
		StudentAgg s1 = new StudentAgg("Mia", 1, "CSE");
		StudentAgg s2 = new StudentAgg("Priya", 2, "CSE");
		StudentAgg s3 = new StudentAgg("John", 1, "EE");
		StudentAgg s4 = new StudentAgg("Rahul", 2, "EE");

		// making a List of
		// CSE Students.
		List<StudentAgg> cse_students = new ArrayList<StudentAgg>();
		cse_students.add(s1);
		cse_students.add(s2);

		// making a List of
		// EE Students
		List<StudentAgg> ee_students = new ArrayList<StudentAgg>();
		ee_students.add(s3);
		ee_students.add(s4);

		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);

		// creating an instance of Institute.
		Institute institute = new Institute("BITS", departments);

		System.out.print("Total students in institute: ");
		System.out.print(institute.getTotalStudentsInInstitute());
	}
}

// student class
class StudentAgg {
	String name;
	int id;
	String dept;

	StudentAgg(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

/*
 * Department class contains list of student Objects. It is associated with
 * student class through its Object(s).
 */
class Department {

	String name;
	private List<StudentAgg> students;

	Department(String name, List<StudentAgg> students) {

		this.name = name;
		this.students = students;
	}

	public List<StudentAgg> getStudents() {
		return students;
	}
}

/*
 * Institute class contains list of Department Objects. It is asoociated with
 * Department class through its Object(s).
 */
class Institute {

	String instituteName;
	private List<Department> departments;

	Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
	}

	// count total students of all departments
	// in a given institute
	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<StudentAgg> students;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (StudentAgg s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}
