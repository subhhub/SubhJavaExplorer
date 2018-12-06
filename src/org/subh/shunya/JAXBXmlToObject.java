package org.subh.shunya;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBXmlToObject {

	public static void main(String[] args) {
		System.out.println("Un-marshalling : JAXB XML to Employee");

		try {
			File file = new File("employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeObject.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			EmployeeObject e = (EmployeeObject) jaxbUnmarshaller.unmarshal(file);
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
