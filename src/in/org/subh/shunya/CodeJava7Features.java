package in.org.subh.shunya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeJava7Features {

	public static void main(String[] args) {

		
		new CodeJava7Features().autoCloaseableTryResource();
	}

	public void testStringInSwitch(String param) {

		final String JAVA5 = "Java 5";
		final String JAVA6 = "Java 6";
		final String JAVA7 = "Java 7";

		switch (param) {
		case JAVA5:
			System.out.println(JAVA5);
			break;
		case JAVA6:
			System.out.println(JAVA6);
			break;
		case JAVA7:
			System.out.println(JAVA7);
			break;
		}
	}

	public void testBinaryIntegralLiterals() {

		int binary = 0b1000; // 2^3 = 8

		if (binary == 8) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public void testUnderscoresNumericLiterals() {

		int oneMillion_ = 1_000_000; // new
		int oneMillion = 1000000;

		if (oneMillion_ == oneMillion) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public void testDinamond() {
		List<String> list = new ArrayList<>();
	}

	public void testMultiCatch() {

		try {
			throw new FileNotFoundException("FileNotFoundException");
		} catch (ArrayIndexOutOfBoundsException | IOException fnfo) {	//exception sequence doesn't matter
			fnfo.printStackTrace();
		}
	}

	public void testTryWithResourcesStatement() throws FileNotFoundException, IOException {

		try (FileInputStream in = new FileInputStream("java7.txt")) {
			System.out.println(in.read());
		}
	}

	public void autoCloaseableTryResource() {

		try (MyResource mr = new MyResource()) {
			System.out.println("MyResource created in try-with-resources");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Out of try-catch block.");
	}
	
}

class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing MyResource");
	}

}





