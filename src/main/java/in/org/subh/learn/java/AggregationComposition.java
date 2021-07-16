package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.List;

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
	
	//employee can have address or not
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

//============================Example of Aggregation================================================
//Team
class Team {
	// players can be 0 or more
	private List players;

	public Team() {
		players = new ArrayList();
	}
}

//Player Object
class Player {
}

//============================Example of Composition================================================
//Car must have Engine
class Car {
	// engine is a mandatory part of the car
	private final Engine engine;

	public Car() {
		engine = new Engine();
	}
}

//Engine Object
class Engine {
}
