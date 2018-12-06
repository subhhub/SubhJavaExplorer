package org.subh.shunya;

public class AggregationComposition {

	public static void main(String[] args) {
		System.out.println("Aggregation and Composition");

		AddressAgg address1 = new AddressAgg("gzb", "UP", "india");
		AddressAgg address2 = new AddressAgg("gno", "UP", "india");

		EmployeeAgg e = new EmployeeAgg(111, "varun", address1);
		EmployeeAgg e2 = new EmployeeAgg(112, "arun", address2);

		e.display();
		e2.display();

	}
}

class AddressAgg {
	String city, state, country;

	public AddressAgg(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

class EmployeeAgg {

	int id;
	String name;
	AddressAgg address;

	public EmployeeAgg(int id, String name, AddressAgg address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
}

class JobComposition {
	private String role;
	private long salary;
	private int id;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

class PersonComposition {

	// composition has-a relationship
	private JobComposition job;

	public PersonComposition() {
		this.job = new JobComposition();
		job.setSalary(1000L);
	}

	public long getSalary() {
		return job.getSalary();
	}
}

