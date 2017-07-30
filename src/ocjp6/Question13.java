package ocjp6;
import java.io.IOException;


public class Question13 {

}

interface A{
	public void doSomething(String thing);	
}
class AImpl implements A{
	public void doSomething(String msg){
		
	}
}
class B{
	public A doIt(){
		return null;
	}
	public Object execute(){
		return "hello";
	}
	public int add(int a, int b)throws IOException	{
		return 0;
	}
}
class C extends B{
	public AImpl doIt(){
		return null;
	}
	public String execute(){
		return "hello";
	}
	
	/*public int add(int a, int b){
		return 0;
	}
	public float add(int a, float b){
		return 0;
	}*/
}