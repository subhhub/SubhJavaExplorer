package in.org.subh.learn.java;

public class DesignPatternAdapters {

	public static void main(String[] args) {

		OldCustomer oldCustomer = new OldCustomer();
		oldCustomer.setName("subh");
		oldCustomer.setAge("30");
		oldCustomer.setAddress("C01,102,560037, Bengaluru");
		
		Customer customer =  new CustomerAdapter(oldCustomer);
		System.out.println(customer.getName());
		System.out.println(customer.getAddress());
	}
}

class CustomerAdapter extends NewCustomer implements Customer{
	
	private OldCustomer oldCustomer;
	
	public CustomerAdapter(OldCustomer oldCustomer) {
		this.oldCustomer = oldCustomer;
		this.adaptData();
	}

	private void adaptData() {

		this.setName(oldCustomer.getName());
		this.setAge(Integer.valueOf(oldCustomer.getAge()));
		Address address = new Address();
		
		String[] oldAddress = oldCustomer.getAddress().split(",");
		address.setStreetName(oldAddress[0]);
		address.setHouseNumber(Integer.parseInt(oldAddress[1]));
		address.setPostalCode(Integer.valueOf(oldAddress[2]));
		address.setCity(oldAddress[3]);
		this.setAddress(address);
	}
}

class NewCustomer{
	private String name;
	private int age;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}

class OldCustomer{
	private String name;
	private String age;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

interface Customer{
	public String getName();
	public int getAge();
	public Address getAddress();
}

class Address{
	private String streetName;
	private int houseNumber;
	private int postalCode;
	private String city;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [streetName=").append(streetName)
				.append(", houseNumber=").append(houseNumber)
				.append(", postalCode=").append(postalCode).append(", city=")
				.append(city).append("]");
		return builder.toString();
	}
}