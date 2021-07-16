package in.org.subh.learn.java;

import java.util.Scanner;

//create CallbackExample1 to calculate total tax  
/**
 * <p>
 * How does the Java callback function work? <br>
1. Create an interface X having a single method A(). <br>
2. Create a method method1() with A as a method parameter. <br>
3. Call the A() method inside of the method1(). <br>
4. For calling method1(), we pass the instance of X and override the A(). <br>
5. Use arrow notation as an alternative to keyword news so that the code is clear. <br>
</p>
 * We implement the tax calculator that calculates the tax(total tax) for the state. 
 * For a state, tax can be more than one but for our example, let's assume that we have only two taxes, 
 * i.e., state tax and central tax. In both the taxes, the central tax will be the same for all states, 
 * but state tax may be different for states.
 * <p>
 * <code>
 * static void calculateTax(address of stateTax() function)  <br>
{   <br>
    central_tax = 2500.0 <br>  
    state_tax = get based on the address of the interface method <br>  
    total_tax = central_tax + state_tax;   <br>
} </code>
 *<p>
 *In the above code, the address or the reference of the stateTax() method is passed for calculating 
 *the sum of taxes in the calculateTax() method. The state code varies from state to state, 
 *so we declare the stateTax() method as an abstract method in the interface.
 *
 */
public class CallbackExample {

	// main() method start
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		
		// create an instance of the Scanner class to take user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state name");

		// get state name from the user
		String state = sc.next();

		// store the state name in an object obj
		Class obj = Class.forName(state);

		// Create a new object of the obj class that reference by the StateTax
		StateTax refer = (StateTax) obj.newInstance();

		// call the calculateTax() method by passing the reference of the StateTax to
		// calculate total tax
		calculateTax(refer);
	}

	static void calculateTax(StateTax data) {
		// central tax will be same for all state
		double central_Tax = 3500.0;

		// get the state_Tax for the user entered state and find the total tax
		double state_Tax = data.stateTax();
		double total_Tax = state_Tax + central_Tax;

		// show the result
		System.out.println("The total Tax of the state is =" + total_Tax);
	}
}

//create interface StateTax having abstract method stateTax()  
interface StateTax {
	// declare abstract method
	double stateTax();
}

//implement the StateTax interface for Haryana   
class Haryana implements StateTax {
	public double stateTax() {
		return 1500.0;
	}
}

//implement the StateTax interface for Utter Pradesh  
class UP implements StateTax {
	public double stateTax() {
		return 2500.0;
	}
}