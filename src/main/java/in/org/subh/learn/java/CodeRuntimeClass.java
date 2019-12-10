package in.org.subh.learn.java;

public class CodeRuntimeClass {

	public static void main(String args[]) throws Exception {
		
//		Runtime.getRuntime().exec("notepad");// will open a new notepad
//		Runtime.getRuntime().exec("C:\\Windows\\system32\\SnippingTool.exe");
		
		
//		Runtime.getRuntime().exec("shutdown -s -t 0");  //use -s switch to shutdown system, -r switch to restart system and -t switch to specify time delay
		
//		Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");	//shutdown windows system in Java
		
//		Runtime.getRuntime().exec("shutdown -r -t 0");		//restart system in Java
		
		System.out.println(Runtime.getRuntime().availableProcessors());  //availableProcessors()
	}
}
