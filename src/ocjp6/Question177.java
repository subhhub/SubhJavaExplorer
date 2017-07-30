package ocjp6;
class TestException extends Exception {
}

class AExe {
	public String sayHello(String name) throws TestException {
		if (name == null)
			throw new TestException();
		return "Hello " + name;
	}
}

public class Question177 {
	public static void main(String[] args) {
		new AExe().sayHello("Aiko");
		
		
		int a; 
		z: 
			for (int i = 0; i < args.length; i++) {
			
		}
	}
}
