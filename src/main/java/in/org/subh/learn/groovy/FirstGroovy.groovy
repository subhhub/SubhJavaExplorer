package test.groovy

class FirstGroovy1 {

	def static main(args) {
		int a = 10;
		int c = 20;
		
		println "Hello World";
		
		System.out.println("Hello");
		
		def v1 = 10;
		def v2 = 20;
		def v3 = add v1, v2;
		println v3;
	} 
	
	def static add(a, b) {
		return a+b;
	}
}

/*def class FirstGroovyDef {
	
		def main(args) {
			int a = 10;
			int c = 20;
			
			println "Hello World";
			
			System.out.println("Hello");
			
		}
}*/
