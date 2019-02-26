/**
 * @author Alec Donovan
 * Class ID: 363
 * Assignment #: 2
 * 
 * This file contains the Calculator class inside of the package cse360assign2
 * 
 * This class acts as a calculator that will calculate basic arithmetic equations and print the
 * total along with the arithmetic history. If the total is divided by 0, it will set total to 0
 * instead of throwing an error. There are 5 methods: getTotal, add, subtract, multiply, divide, and getHistory
 * which will perform the function expressed by it's name.
 * */
package cse360assign2;

/**
 * This class contains 1 private instance variable which is total. There are 5 functions contained
 * within this class:
 * getTotal will return the total value.
 * Add will add the total with the parameter.
 * Subtract will subtract the total from the parameter.
 * Multiply will multiply the total from the parameter.
 * Divide will divide total by the parameter.
 * getHistory will return all the actions performed thus far.
 * The constructor Calculator is called when creating an object of this class which
 * sets total to 0.
 * 
 * @author Alec Donovan
 */
public class Calculator {

	private int total;
	
	/**
	 * This is the constructor of the Calculator that takes no parameters and creates
	 * a new calculator obeject that contains a variable 'total' which is initialized to
	 * 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * The getTotal will return the private variable 'total' from a Calculator
	 * object.
	 * @param no parameters are used for this function
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * The add function will take the total of a Calculator object
	 * and add that total to the integer value within the parameter.
	 * @param Integer value: An integer that is added to total.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * The subtract function will take the total of a Calculator object
	 * and subtract the integer value in the parameter from that total.
	 * @param Integer value: An integer that is subtracted from the total.
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * The multiply function will take the total of a Calculator object
	 * and multiply the integer value in the parameter from the total.
	 * @param Integer value: An integer that is multiplied to the total.
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * The divide function will take the total of a Calculator object
	 * and divide the integer value in the parameter from the total.
	 * @param Integer value: An integer that is is divided by the total.
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * The getHistory function will print all previous functions executed
	 * with spaces in between each character.
	 * @param No parameters used for this function.
	 */
	public String getHistory () {
		return "";
	}
}