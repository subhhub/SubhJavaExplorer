package in.org.subh.learn.java;

/**
 * @author esubkew
 * 
 * Java program to illustrate the concept of Association
 * 
 * Association between both the classes in main method
 * 
 * In this example two separate classes Bank and Employee are associated through their Objects. 
 * Bank can have many employees, So it is a one-to-many relationship.
 *
 */
public class DependencyAssociation {

	public static void main(String[] args) {
		Bank bank = new Bank("Axis");
		Employee emp = new Employee("Neha");

		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
	}
}

// class bank
class Bank {
	private String name;

	// bank name
	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}

// employee class
class Employee {
	private String name;

	// employee name
	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName() {
		return this.name;
	}
}