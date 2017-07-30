package in.org.subh.shunya;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {

	public static void main(String[] args) {
		System.out.println("OverrideTest ");

		CommonTestA ca = new CommonTestA();

		CommonTestB cb = new CommonTestB();
//		cb.show1();
		
		CommonTestA caa = new CommonTestB();
//		caa.show3(10);
		System.out.println(caa.x);
		
	}

}
//abstract class CommonTestA{
class CommonTestA{
	
	int x = 10;
	
	void show(){
		
	}
	private void show1(){
		System.out.println("show1");
	}
//	synchronized static final void show20(){};
	
	/*void show3(int... a){
		System.out.println(" Parent VarArg ");
	}*/
	
	void show3(int a)throws FileNotFoundException {
		System.out.println(" Parent VarArg show3 ");
	}
	void show4(int a)throws IOException {
		System.out.println(" Parent VarArg show4 ");
	}
	
	void show5(int a)throws NullPointerException {
		System.out.println(" Parent VarArg show5 ");
	}
	synchronized void show6(int a)throws RuntimeException {
		System.out.println(" Parent VarArg show6 ");
	}
	
	static void staticMethod() {
		System.out.println("Class X");
	}
}

/*abstract class CommonTestB extends CommonTestA{
	abstract void show();
	
}*/

class CommonTestB extends CommonTestA{
	
	/*int x = 20;
	
	void show1(){
		System.out.println("CommonTestB show1 ");
	}
	
	void show2(){
		System.out.println("CommonTestB show2");
	}
	void show3(int a)throws StringIndexOutOfBoundsException{
		System.out.println(" Child with VarArg ");
	}*/
	
	@Override
	void show3(int a) {
		System.out.println(" Child VarArg show3 ");
	}
	
	@Override
	void show4(int a)throws FileNotFoundException {
		System.out.println(" Child VarArg show4 ");
	}
	
	@Override
	void show5(int a)throws RuntimeException {
		System.out.println(" Child VarArg show5 ");
	}
	
	@Override
	void show6(int a) {
		System.out.println(" Child VarArg show6 ");
	}
	
	static void staticMethod() {		//Its not a overriden method its a class method.
		System.out.println("Class Y");
	}
}
