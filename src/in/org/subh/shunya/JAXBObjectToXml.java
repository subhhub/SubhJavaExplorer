package in.org.subh.shunya;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class JAXBObjectToXml {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		System.out.println("JAXB Employee to XML");

		JAXBContext contextObj = JAXBContext.newInstance(EmployeeObject.class);

		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		EmployeeObject emp1 = new EmployeeObject(1, "Vimal Jaiswal", 50000);

		marshallerObj.marshal(emp1, new FileOutputStream("employee.xml"));
	}
}

@XmlRootElement
class EmployeeObject {
	private int id;
	private String name;
	private float salary;

	public EmployeeObject() {
	}

	public EmployeeObject(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}